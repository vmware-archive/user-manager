package io.pivotal;

import org.junit.Test;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

public class UserRepoTest {

    @Test
    public void test_all_returnsUsers() throws Exception {
        FakeUserDataMapper userDataMapper = new FakeUserDataMapper();
        User expectedUser = new User(2, "adam", "secret");
        userDataMapper.all_returnValue = singletonList(expectedUser);

        UserRepo repo = new UserRepo(userDataMapper);

        List<User> users = repo.findAll();
        User user = users.get(0);
        assertThat(user).isEqualTo(expectedUser);
    }
}
