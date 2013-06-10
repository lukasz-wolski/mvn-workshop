package pl.jug.szczecin.workshop;

import pl.jug.szczecin.workshop.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lukasz
 * Date: 6/10/13
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserStoragePersistent implements UserStorage {
    @Override
    public void storeUser(User user) {
        throw new UnsupportedOperationException("not yet implemented!");
    }

    @Override
    public List<User> getUsers() {
        throw new UnsupportedOperationException("not yet implemented!");
    }

}
