package lt.codeacademy.myTestingTool.models;

public class Teacher extends User {

    public Teacher(User user) {
        this.setId(user.getId());
        this.setUsername(user.getUsername());
        this.setName(user.getName());
        this.setRole(user.getRole());
    }
}
