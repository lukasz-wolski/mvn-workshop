package pl.jug.szczecin.workshop;

import pl.jug.szczecin.workshop.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    private List<User> users = new ArrayList<User>();

    public void storeUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
