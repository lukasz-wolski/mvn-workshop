package pl.jug.szczecin.workshop;

import org.testng.annotations.Test;
import pl.jug.szczecin.workshop.entity.User;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UserStorageTest {

    public static final String NAME = "Paweł";
    public static final String SURENAME = "Stawicki";
    public static final String EMAIL = "pawelstawicki@gmail.com";
    public static final String WEBPAGE = "pawelstawicki.blogspot.com";

    @Test
    public void shouldStoreUser() {
        // Given
        UserStorage storage = new UserStorage();

        // When
        storage.storeUser(new User(NAME, SURENAME, EMAIL, WEBPAGE));

        // Then
        List<User> users = storage.getUsers();
        assertThat(users).hasSize(1);

        User user = users.get(0);
        assertThat(user.getName()).isEqualTo(NAME);
        assertThat(user.getSurname()).isEqualTo(SURENAME);
        assertThat(user.getEmail()).isEqualTo(EMAIL);
        assertThat(user.getWebpage()).isEqualTo(WEBPAGE);
    }

}
