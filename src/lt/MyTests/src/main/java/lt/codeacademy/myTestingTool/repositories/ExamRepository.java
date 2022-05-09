package lt.codeacademy.myTestingTool.repositories;

import lt.codeacademy.myTestingTool.FileEditor;
import lt.codeacademy.myTestingTool.entities.ExamEntity;
import lt.codeacademy.myTestingTool.models.Exam;
import lt.codeacademy.myTestingTool.models.QuestionAndAnswers;

import java.util.ArrayList;
import java.util.List;

public class ExamRepository {
    private final String FILE_NAME = "exams.json";
    private FileEditor<ExamEntity> fileEditor = new FileEditor(FILE_NAME, ExamEntity.class);
    private final QuestionsRepository questionsRepository = new QuestionsRepository();
    private List<Exam> exams;

    public ExamRepository() {
        exams = setExams();
    }

    public void addExam(String name, String type) {
        Exam exam = new Exam(exams.size(), type, name, new ArrayList<>());
        exams.add(exam);
        addToFile();
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void removeExam(int examID, String question) {
        exams.remove(examID).addQuestion(question);
        addToFile();
    }

    public void addQuestionToExam(int examID, int questionId) {
        QuestionAndAnswers question = questionsRepository.getById(questionId);
        exams.get(examID).getQuestionList().add(question);
        addToFile();
    }

    public void renewData() {
        questionsRepository.renewData();
        exams = setExams();
    }

    void addToFile() {
        fileEditor.addToFile(convertExamsToEntities(exams));
        renewData();
    }

    List<ExamEntity> convertExamsToEntities(List<Exam> examList) {
        List<ExamEntity> examEntities = new ArrayList<>();
        for (Exam exam : examList) {
            List<Integer> questionIds = new ArrayList<>();
            for (QuestionAndAnswers questions : exam.getQuestionList()) {
                questionIds.add(questions.getId());
            }
            ExamEntity examEntity = new ExamEntity(exam.getId(), exam.getType(), exam.getName(), questionIds);
            examEntities.add(examEntity);
        }
        return examEntities;
    }

    private List<Exam> setExams() {
        List<ExamEntity> list = fileEditor.readFromFile();
        return entitiesToExam(list);
    }

    public Exam getExamById(int id) {
        return exams.get(id);
    }

    private List<Exam> entitiesToExam(List<ExamEntity> examEntities) {
        List<Exam> exams1 = new ArrayList<>();
        QuestionAndAnswers questionAndAnswers;
        List<QuestionAndAnswers> newlist;

        for (ExamEntity c : examEntities) {
            newlist = new ArrayList<>();
            for (Integer b : c.getQuestionIds()) {
                questionAndAnswers = questionsRepository.getById(b);
                newlist.add(questionAndAnswers);
            }
            exams1.add(new Exam(c.getId(), c.getName(), c.getType(), newlist));
        }
        return exams1;
    }
}