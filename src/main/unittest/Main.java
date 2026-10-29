package main.unittest;

import main.unittest.calculator.Calculator;
import main.unittest.user.User;
import main.unittest.user.UserService;

public class Main {
    public static void main(String[] args) {

        /*
        Calculator calculator = new Calculator();
        int result = calculator.add(2,2);
        System.out.println(result);


         */


        UserService userService = new UserService();
        User user1 = new User("Yahya", "yaya@hotmail.com");
        System.out.println(user1.getName());
        System.out.println(user1.getEmail());

    }
}
