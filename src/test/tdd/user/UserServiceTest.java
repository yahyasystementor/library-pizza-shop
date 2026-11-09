package test.tdd.user;

import main.tdd.user.User;
import main.tdd.user.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService userService;
    private User user;


    /*
    TODO Skapa tester för getUserByEmail() och metoden efter
        Skapa tester för updateUser() och metoden efter

        FÖLJ TDD PRINCIPER RED GREEN REFACTOR
     */



    @BeforeEach
    void setUp(){
        userService = new UserService();
        user = new User("Yahya", "Yahya@gmail.com");
    }

    @Test
    void addUserShouldSaveAUser(){
        // Act
        userService.addUser(user);

        // Assert
        assertEquals(1,userService.getUserCount());

    }

    @Test
    void deleteUserShouldDeleteAUser(){
        // Arrange
        userService.addUser(user);

        boolean deleted = userService.deleteUser("Yahya@gmail.com");

        assertTrue(deleted);

        assertEquals(0, userService.getUserCount());
    }


    @Test
    void deleteUserShouldReturnFalseWhenUserDoesNotExist(){
        boolean deleted = userService.deleteUser("test@gmail.com");

        assertFalse(deleted);

        assertEquals(0, userService.getUserCount());
    }


    @Test
    void getUserByEmailShouldAUser(){
        // Arrange
        userService.addUser(user);


        // Act
        User foundUser = userService.getUserByEmail("Yahya@gmail.com");

       assertNotNull(foundUser);

       // assertSame(user,foundUser);

    }


    @Test
    void getUserByEmailShouldReturnCorrectUser(){
        // Arrange
        userService.addUser(user);

        //Act
        User foundUser = userService.getUserByEmail("Yahya@gmail.com");

        // Assert
        assertEquals("Yahya", foundUser.getName());
    }


    @Test
    void updateUserShouldChangeName(){

        // Arrange
        userService.addUser(user);

        boolean updated = userService.updateUser("Yahya@gmail.com", "Lisa");

        assertTrue(updated);

        User updatedUser = userService.getUserByEmail("Yahya@gmail.com");

        assertEquals("Lisa", updatedUser.getName());

    }


}
