package lt.codeacademy.myTestingTool.models;

public class User {
    private int id;
    private String username;
    private String name;
    private Role role;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User() {
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public User(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public User(int id, String name, String username, Role role) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.role = role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", roles=" + role +
                '}';
    }
}