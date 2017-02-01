package io.pivotal;

import java.util.List;

import static java.util.Arrays.asList;

public class UserRepo {
    public List<User> all() {
        return asList(new User(1, "bob","secret"));
    }
}
