package io.pivotal;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static java.util.Collections.singletonList;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class UsersControllerTest {
    @Test
    public void test_index_returnsUsers_onSuccess() throws Exception {
        UserRepo repo = mock(UserRepo.class);
        when(repo.all()).thenReturn(
                singletonList(new User(1, "adam", "secret"))
        );
        UsersController controller = new UsersController(repo);
        MockMvc mockController = standaloneSetup(controller).build();

        mockController.perform(MockMvcRequestBuilders.get("/users"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id", is(1)))
                .andExpect(jsonPath("$[0].username", is("adam")))
                .andExpect(jsonPath("$[0].password", is("secret")));
    }
}
