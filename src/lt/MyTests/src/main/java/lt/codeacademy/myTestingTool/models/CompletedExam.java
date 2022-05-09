package lt.codeacademy.myTestingTool.models;

public class CompletedExam {

    private int id;
    private final Exam exam;
    private final User user;
    private final int grade;

    public CompletedExam(int id, Exam exam, User user, int grade) {
        this.id = id;
        this.exam = exam;
        this.user = user;
        this.grade = grade;
    }

    public CompletedExam(Exam exam, User user, int grade) {
        this.user = user;
        this.exam = exam;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public Exam getExam() {
        return exam;
    }

    public User getUser() {
        return user;
    }

    public int getGrade() {
        return grade;
    }


    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CompletedExam{" +
                "id=" + id +
                ", exam=" + exam +
                ", grade=" + grade +
                '}';
    }
}