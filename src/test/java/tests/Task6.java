package tests;

import org.junit.jupiter.api.Test;
import testdata.User;
import testdata.UserService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6 {

    @Test
    void usersSizeIfUserAdded() {
        var userService = new UserService();
        userService.add(new User());
        userService.add(new User());
        userService.add(new User());

        List<User> users;
        users = userService.getAll();

        int expectedUsersSize = 3;
        int actualUsersSize = users.size();
        assertEquals(expectedUsersSize, actualUsersSize);
    }
}
