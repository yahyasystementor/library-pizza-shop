package test.user;

import main.unittest.user.User;
import main.unittest.user.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private  UserService userService;
    private User user;



    @BeforeEach
    public void setUp(){
        System.out.println("Before each test");
        userService = new UserService();
        user = new User("Anna", "anna@email.com");
        userService.addUser(user);
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After each test");
        userService.getUsers().clear();
    }


    @Test
    public void addUserShouldAddANewUser(){
        // AAA
        // A = Arrange
        UserService userService = new UserService();
        User user1 = new User("Yahya", "yaya@hotmail.com");


        // A = Act

        // A = Assert
        assertEquals(1,userService.getUsers().size());
    }

    @Test
    public void getUserByEmailShouldReturnCorrectUser(){
        // Arrange

        // Act

        User foundUser = userService.getUserByEmail("anna@email.com");

        assertNotNull(foundUser);
        assertEquals("Anna", foundUser.getName());
        assertEquals("anna@email.com", foundUser.getEmail());

    }

    @Test
    public void updateUserShouldUpdateCorrectUser(){
        // Arrange = Lägga till användare för att uppdatera

        // Act
        boolean updated = userService.updateUser("anna@email.com",
                "Anton");

        assertTrue(updated);

        User updatedUser = userService.getUserByEmail("anna@email.com");
        assertEquals("Anton", updatedUser.getName());

    }


    @Test
    public void deleteUserShouldDeleteCorrectUser(){

        // Arrange

        // Act

        boolean deleted = userService.deleteUser("anna@email.com");

        assertTrue(deleted);
        assertEquals(0, userService.getUsers().size());

        User foundUser = userService.getUserByEmail("anna@email.com");
        assertNull(foundUser);

    }







}
