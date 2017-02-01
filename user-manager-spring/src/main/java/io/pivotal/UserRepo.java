package io.pivotal;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class UserRepo {
    private UserDataMapper userDataMapper;

    UserRepo(UserDataMapper userDataMapper) {
        this.userDataMapper = userDataMapper;
    }

    List<User> findAll() {
        return userDataMapper.findAll();
    }
}
