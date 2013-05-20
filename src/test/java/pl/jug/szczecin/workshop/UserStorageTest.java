package pl.jug.szczecin.workshop;

import org.testng.annotations.Test;
import pl.jug.szczecin.workshop.entity.User;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UserStorageTest {

    @Test
    public void shouldStoreUser() {
        // Given
        UserStorage storage = new UserStorage();

        // When
        storage.storeUser(new User("Paweł", "Stawicki", "pawelstawicki@gmail.com", "pawelstawicki.blogspot.com"));

        // Then
        List<User> users = storage.getUsers();
        assertThat(users).hasSize(1);

        User user = users.get(0);
        assertThat(user.getName()).isEqualTo("Paweł");
        assertThat(user.getSurname()).isEqualTo("Stawicki");
        assertThat(user.getEmail()).isEqualTo("pawelstawicki@gmail.com");
        assertThat(user.getWebpage()).isEqualTo("pawelstawicki.blogspot.com");
    }

}
