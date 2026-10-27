package main.errorhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {



        Path path = Path.of("users.txt");

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
            String line;
            while ((line = reader.readLine()) !=null) {

                String[] parts = line.split(",");

                System.out.println(parts[0]);
                System.out.println(parts[1]);
                System.out.println(parts[2]);

            }

        } catch (IOException e) {
            System.out.println("Error reading users.txt file");
            System.out.println(e.getMessage());
        }












        /*
        List<User> users =  new ArrayList<>();

        users.add(new User("Yahya", "test@gmail.com", 33));
        users.add(new User("Maria", "Maria@gmail.com", 33));
        users.add(new User("Linus", "Linus@gmail.com", 33));

        Path path = Path.of("users.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
            for (User user : users) {
                writer.write(user.getName() + user.getEmail() + user.getAge());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing users.txt file");
            System.out.println(e.getMessage());
        }

         */




    }
}


        /*

      try {
          registerUser();
      }catch(NumberFormatException e){
          System.out.println(e);
      }

    }


    public static void registerUser() {
        int age = readAge("Twenty");
        System.out.println("Age is.. " + age);
    }


    public static int readAge(String text) {
        return Integer.parseInt(text);
    }
            // Värdet = null
            NullPointerException

            // Använder fel index i array
            ArrayIndexOutOfBoundsException

            //  Ogiltiga mattematiska operations
            ArithmeticException


            Texte kan inte bli ett nummer
            NumberFormatException


            // Metoden får ett otillåtet värde
            IllegalArgumentException



            // Filen finns inte
            FileNotFoundException



            Fel vid skrivning eller läsning
            IOException



           // Basklass för många unchecked exceptions
            RunTimeException


            //
            Expection




         */




        /*
       Path path = Path.of("users.txt");

       try {

           // Files.createFile(path);
           Files.writeString(path,"Linus, 20, Linus@hotmail.com");

           System.out.println("Saved");
       } catch (IOException e) {
           System.out.println("Could not save ");
           System.out.println(e.getMessage());
       }


         */