package main.unittest.user;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users = new HashMap<>();


    // CRUD
    // Create
    public void addUser(User user) {
        users.put(user.getEmail(),  user);
    }

    // TODO
    /*
        SKRIVER TEST FÖR getUserByEmail, updateUser, deleteUser
        Använd BeforeEach och AfterEach
     */


    // Read
    public User getUserByEmail(String email){
        return users.get(email);
    }
    //Update
    public boolean updateUser(String email,String newName) {
        User user = users.get(email);
        if (user == null){
            return false;
        }
        user.setName(newName);
        return true;
    }

    public boolean deleteUser(String email){
        User user = users.remove(email);
        return user != null;

    }

    public Map<String, User> getUsers() {
        return users;
    }
}
