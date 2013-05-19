package pl.jug.szczecin.workshop;

import pl.jug.szczecin.workshop.entity.User;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/storage")
public class UserStorageRest {

    private static UserStorage userStorage = new UserStorage();

    @POST
    @Path("store")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public void storeUser(
            @FormParam("name") String name,
            @FormParam("surname") String surname,
            @FormParam("email") String email,
            @FormParam("webpage") String webpage) {

        User user = new User(name, surname, email, webpage);
        System.out.println("User to store: " + user);
        userStorage.storeUser(user);
    }

    @GET
    @Path("users")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers() {
        return userStorage.getUsers();
    }
}
