package io.pivotal;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UserRepoTest {

    @Test
    public void test_all_returnsUsers() throws Exception {
        UserRepo repo = new UserRepo();

        List<User> users = repo.all();
        User user = users.get(0);
        assertThat(user.getId()).isEqualTo(1);
    }
}
