package lt.codeacademy.myTestingTool.models;

import com.google.gson.annotations.SerializedName;

public class Role {

    @SerializedName("roleId")
    int roleId;
    @SerializedName("name")
    String name;

    public Role() {
    }

    public Role(int roleId, String name) {
        this.roleId = roleId;
        this.name = name;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getName() {
        return name;
    }
}
