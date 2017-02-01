package io.pivotal;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcUserDataMapper implements UserDataMapper {
    private JdbcTemplate jdbcTemplate;

    JdbcUserDataMapper(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {
        String sqlString = "SELECT * from users";


        return jdbcTemplate.query(
                sqlString,
                (resultSet, rowNumber) -> new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password")
                )
        );
    }
}
