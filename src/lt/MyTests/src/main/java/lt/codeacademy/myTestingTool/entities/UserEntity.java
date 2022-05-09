package lt.codeacademy.myTestingTool.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lt.codeacademy.myTestingTool.models.User;

public class UserEntity {

    @JsonProperty("id")
    private int id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("name")
    private String name;
    @JsonProperty("roleId")
    private int roleId;

    public UserEntity() {
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public int getRoleId() {
        return roleId;
    }

    public UserEntity(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.name = user.getName();
        this.roleId = user.getRole().getRoleId();
    }

    public UserEntity(int id, String username, String name, int roleId) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
