package io.pivotal;

public class User {
    private long id;
    private String username;
    private String password;

    User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @SuppressWarnings("unused")
    public long getId() {
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
