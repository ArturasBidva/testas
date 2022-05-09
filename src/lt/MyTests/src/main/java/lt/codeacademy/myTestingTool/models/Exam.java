package lt.codeacademy.myTestingTool.models;

import java.util.List;

public class Exam {

    private int id;
    private String name;
    private String type;
    private final List<QuestionAndAnswers> questionList;

    public Exam(int id, String name, String type,List<QuestionAndAnswers> questionList) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.questionList = questionList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public List<QuestionAndAnswers> getQuestionList() {
        return questionList;
    }

    public void addQuestion(String question) {
        QuestionAndAnswers questionAndAnswers = new QuestionAndAnswers(questionList.size(), "");
        questionList.add(questionAndAnswers);
    }


    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", questions=" + questionList +
                '}';
    }

}
