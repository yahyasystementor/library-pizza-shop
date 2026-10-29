package test.user;

import main.unittest.user.User;
import main.unittest.user.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {





    @Test
    public void addUserShouldAddANewUser(){
        // AAA

        // A = Arrange
        UserService userService = new UserService();
        User user = new User("Yahya", "Yahya@gmail.com");

        // A = Act
        userService.addUser(user);

        // A = Assert

        assertEquals(1,userService.getUsers().size());

        // Get the created users
        User foundUser = userService.getUserByEmail("Yahya@gmail.com");

        assertEquals("Yahya", foundUser.getName());
        assertEquals("Yahya@gmail.com", foundUser.getEmail());

    }





}
