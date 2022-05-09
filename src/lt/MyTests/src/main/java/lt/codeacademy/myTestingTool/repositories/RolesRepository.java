package lt.codeacademy.myTestingTool.repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lt.codeacademy.myTestingTool.models.Role;
import lt.codeacademy.myTestingTool.models.Student;
import lt.codeacademy.myTestingTool.models.Teacher;
import lt.codeacademy.myTestingTool.models.User;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RolesRepository implements Repository<Role> {

    private Map<Integer, Role> roleMap = new HashMap<>();

    public RolesRepository() {
        renewData();
    }

    List<Role> getRolesList() {
        List<Role> rolesList;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            rolesList = objectMapper.readValue(
                    new File("roles.json"),
                    new TypeReference<>() {
                    }
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return rolesList;
    }

    Map<Integer, Role> listToMap(List<Role> roles) {
        Map<Integer, Role> roleMap = new HashMap<>();
        for (Role role : roles) {
            roleMap.put(role.getRoleId(), role);
        }
        return roleMap;
    }

    public User getUserByRoleId(User user) {
        Role role = getById(user.getRole().getRoleId());
        if (role.getRoleId() == 0) {
            return new Teacher(user);
        } else {
            return new Student(user);
        }
    }

    @Override
    public void renewData() {
        roleMap = listToMap(getRolesList());
    }

    @Override
    public Role getById(int id) {
        return roleMap.get(id);
    }

    @Override
    public void add(Role item) {
    }
}