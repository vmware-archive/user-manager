package io.pivotal;

import java.util.List;

public class FakeUserDataMapper implements UserDataMapper {
    List<User> all_returnValue;

    @Override
    public List<User> findAll() {
        return all_returnValue;
    }
}
