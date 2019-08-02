package adam.http.springboot;

import java.util.Objects;

public class User {
    
    private int uuid;
    private String name;
    private String email;

    public User() {
    }

    public User(int uuid, String name, String email) {
        this.uuid = uuid;
        this.name = name;
        this.email = email;
    }

    public int getUuid() {
        return this.uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User uuid(int uuid) {
        this.uuid = uuid;
        return this;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return uuid == user.uuid && Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, email);
    }

    @Override
    public String toString() {
        return "{" +
            " uuid='" + getUuid() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }



}