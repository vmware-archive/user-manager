package io.pivotal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RequestMapping("/users")
@RestController
public class UsersController {

    @GetMapping
    public List<User> index() {
        return Collections.singletonList(new User(1, "adam", "secret"));
    }
}
