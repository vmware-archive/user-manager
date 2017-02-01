package io.pivotal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class JdbcUserDataMapperTest {
    private JdbcTemplate jdbcTemplate;

    @Before
    public void setUp() throws Exception {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost/user_manager_test");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @After
    public void tearDown() throws Exception {
        jdbcTemplate.update("TRUNCATE TABLE users");
    }

    @Test
    public void test_findAll() throws Exception {
        JdbcUserDataMapper dataMapper = new JdbcUserDataMapper(jdbcTemplate);

        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate)
                .withTableName("users")
                .usingColumns("username", "password")
                .usingGeneratedKeyColumns("id");

        Map<String, Object> params = new HashMap<>();
        params.put("username", "Bob");
        params.put("password", "letmein");

        long userId = insert.executeAndReturnKey(params).longValue();

        User user = new User(userId, "Bob", "letmein");
        List<User> expectedList = Collections.singletonList(user);
        assertThat(dataMapper.findAll()).isEqualTo(expectedList);
    }

}