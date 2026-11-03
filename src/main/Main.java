package main;

import main.unittest.user.User;
import main.unittest.user.UserService;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.*;

public class Main {

    private static final Logger LOGGER =
            Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        LOGGER.info("Programmet startar");

        UserService userService = new UserService();

        User user = new User("Yahya", "Yahya@gmail.com");
        userService.addUser(user);
        userService.updateUser("yahya@gmail.com", "Hello");
        userService.deleteUser("Yahya@gmail.com");

        LOGGER.info("Programmet stannar");
        LOGGER.warning("varna om något i appen");
        LOGGER.severe("Något har gått riktigt illa!");
    }
}