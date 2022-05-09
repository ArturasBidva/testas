package lt.codeacademy.myTestingTool.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ExamEntity {

    @JsonProperty("id")
    int id;
    @JsonProperty("type")
    String type;
    @JsonProperty("name")
    String name;
    @JsonProperty("questionIds")
    List<Integer> questionIds;

    public ExamEntity(int id, String type, String name, List<Integer> questionIds) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.questionIds = questionIds;
    }

    public ExamEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getQuestionIds() {
        return questionIds;
    }

    @Override
    public String toString() {
        return "ExamEntity{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", questionIds=" + questionIds +
                '}';
    }
}
