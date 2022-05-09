package lt.codeacademy.myTestingTool.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lt.codeacademy.myTestingTool.models.CompletedExam;

public class CompletedExamEntity {

    @JsonProperty("id")
    int id;
    @JsonProperty("examId")
    int examid;
    @JsonProperty("userId")
    int userid;
    @JsonProperty("grade")
    int grade;

    public int getId() {
        return id;
    }

    public CompletedExamEntity() {
    }

    public CompletedExamEntity(int id, int examid, int userid, int grade) {
        this.id = id;
        this.examid = examid;
        this.userid = userid;
        this.grade = grade;
    }

    public CompletedExamEntity(CompletedExam completedExam) {
        this.id = completedExam.getId();
        this.examid = completedExam.getExam().getId();
        this.userid = completedExam.getUser().getId();
        this.grade = completedExam.getGrade();
    }


    public int getExamid() {
        return examid;
    }

    public int getUserid() {
        return userid;
    }

    public int getGrade() {
        return grade;
    }

}