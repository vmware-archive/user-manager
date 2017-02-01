package io.pivotal;

public class User {
    private int id;
    private String username;
    private String password;

    User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @SuppressWarnings("unused")
    public int getId() {
        return id;
    }

    @SuppressWarnings("unused")
    public String getUsername() {
        return username;
    }

    @SuppressWarnings("unused")
    public String getPassword() {
        return password;
    }
}
