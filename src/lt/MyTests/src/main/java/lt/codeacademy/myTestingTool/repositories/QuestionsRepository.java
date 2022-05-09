package lt.codeacademy.myTestingTool.repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lt.codeacademy.myTestingTool.models.QuestionAndAnswers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class QuestionsRepository implements Repository<QuestionAndAnswers> {

    private Map<Integer, QuestionAndAnswers> questions;

    public QuestionsRepository() {
        questions = listToMap(getQuestionAndAnswersList());
    }

    public Map<Integer, QuestionAndAnswers> getQuestions() {
        return questions;
    }

    public Map<Integer, QuestionAndAnswers> listToMap(List<QuestionAndAnswers> questionsList) {
        Map<Integer, QuestionAndAnswers> questionsMap = new HashMap<>();
        for(QuestionAndAnswers question: questionsList) {
            questionsMap.put(question.getId(),question);
        }
        return questionsMap;
    }

    private List<QuestionAndAnswers> getQuestionAndAnswersList() {
        List<QuestionAndAnswers> list;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            list = objectMapper.readValue(new File("questionAndAnswers.json"), new TypeReference<>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void addQuestion( String question) {
        int id;
        do {
            id = generateId();
        } while (questions.containsKey(id));
        QuestionAndAnswers questionAndAnswers = new QuestionAndAnswers(id, question, new ArrayList<>(),null);
        questions.put(id,questionAndAnswers);
        addToFile();
    }

    public void setRightAnswer(int questionId, int rightAnswerIndex) {
        questions.get(questionId).setRightAnswerIndex(rightAnswerIndex);
        addToFile();
    }

    public void removeQuestion(int id){
        questions.remove(id);
        addToFile();
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(100000);
    }

    public void renewData() {
        questions = listToMap(getQuestionAndAnswersList());
    }

    @Override
    public QuestionAndAnswers getById(int id) {
        return questions.get(id);
    }

    @Override
    public void add(QuestionAndAnswers item) {
        int id;
        do {
            id = generateId();
        } while (questions.containsKey(id));
        QuestionAndAnswers questionAndAnswers = new QuestionAndAnswers(id, item.getQuestion(), new ArrayList<>(),null);
        questions.put(id,questionAndAnswers);
        addToFile();
    }

    public void addAnswer(int questionId, String answer) {
        questions.get(questionId).addAnswer(answer);
        addToFile();
    }

    public List<QuestionAndAnswers> mapToList(Map<Integer, QuestionAndAnswers> questionsMap) {
        List<QuestionAndAnswers> questions = new ArrayList<>();
        for(Map.Entry<Integer, QuestionAndAnswers> entry : questionsMap.entrySet()) {
            QuestionAndAnswers value = entry.getValue();
            questions.add(value);
        }
        return questions;
    }

    public void addToFile() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(Paths.get("questionAndAnswers.json").toFile(), mapToList(questions));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        renewData();
    }
}