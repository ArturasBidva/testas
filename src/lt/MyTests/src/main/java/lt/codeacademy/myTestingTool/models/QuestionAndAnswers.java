package lt.codeacademy.myTestingTool.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class QuestionAndAnswers {

    @JsonProperty("id")
    int id;

    @JsonProperty("question")
    String question;

    @JsonProperty("answers")
    List<String> answers;

    @JsonProperty("rightAnswer")
    Integer rightAnswerIndex;

    public QuestionAndAnswers() {
    }

    public QuestionAndAnswers(int id, String question) {
        this.id = id;
        this.question = question;
        this.answers = new ArrayList<>();
        this.rightAnswerIndex = null;
    }

    public QuestionAndAnswers(int id, String question, List<String> answers, Integer rightAnswerIndex) {
        this.id = id;
        this.question = question;
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRightAnswerIndex(Integer rightAnswerIndex) {
        this.rightAnswerIndex = rightAnswerIndex;
    }

    public Integer getRightAnswerIndex() {
        return rightAnswerIndex;
    }

    public QuestionAndAnswers(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String toQuestion() {
        return id + ". " + question;
    }

    @Override
    public String toString() {
        return "QuestionAndAnswers{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }

    public void addAnswer(String answer) {
        answers.add(answer);
    }
}
