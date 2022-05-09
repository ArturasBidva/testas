package lt.codeacademy.myTestingTool.models;

public class Student extends User {

    public Student(User user) {
        this.setId(user.getId());
        this.setUsername(user.getUsername());
        this.setName(user.getName());
        this.setRole(user.getRole());
    }
}