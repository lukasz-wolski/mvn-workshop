package pl.jug.szczecin.workshop.entity;

public class User {

    private final String name;
    private final String surname;
    private final String email;
    private final String webpage;

    public User(String name, String surname, String email, String webpage) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.webpage = webpage;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getWebpage() {
        return webpage;
    }
}
