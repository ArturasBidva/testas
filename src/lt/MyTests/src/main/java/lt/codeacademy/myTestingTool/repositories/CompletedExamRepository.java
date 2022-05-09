package lt.codeacademy.myTestingTool.repositories;

import lt.codeacademy.myTestingTool.FileEditor;
import lt.codeacademy.myTestingTool.entities.CompletedExamEntity;
import lt.codeacademy.myTestingTool.models.CompletedExam;
import lt.codeacademy.myTestingTool.models.Exam;
import lt.codeacademy.myTestingTool.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompletedExamRepository implements Repository<CompletedExam> {
    Map<Integer, CompletedExam> completedExamMap;
    private final FileEditor<CompletedExamEntity> fileEditor = new FileEditor("completedExams.json", CompletedExamEntity.class);

    ExamRepository examRepository = new ExamRepository();
    UserRepository userRepository = new UserRepository();

    public CompletedExamRepository() {
        renewData();
    }

    public void renewData() {
        completedExamMap = getData();
    }

    @Override
    public CompletedExam getById(int id) {
        return null;
    }

    @Override
    public void add(CompletedExam item) {
        int id = completedExamMap.size();
        item.setId(id);
        completedExamMap.put(item.getId(), item);
        writeToFile();
    }

    public Map<Integer, CompletedExam> getData() {
        Map<Integer, CompletedExam> completedExamMap = new HashMap<>();
        List<CompletedExamEntity> completedExamEntities = fileEditor.readFromFile();
        for(CompletedExamEntity entity: completedExamEntities) {
            Exam exam = examRepository.getExamById(entity.getExamid());
            User user = userRepository.getById(entity.getUserid());
            CompletedExam completedExam = new CompletedExam(entity.getId(),exam,user,entity.getGrade());
            completedExamMap.put(completedExam.getId(), completedExam);
        }
        return completedExamMap;
    }

    public Map<Integer, CompletedExam> getCompletedExamMap() {
        return completedExamMap;
    }

    public void writeToFile() {
        fileEditor.addToFile(mapToEntitiesList());
        renewData();
    }

    List<CompletedExamEntity> mapToEntitiesList() {
        List<CompletedExamEntity> examList = new ArrayList<>();
        for (Map.Entry<Integer, CompletedExam> entry : completedExamMap.entrySet()) {
            CompletedExamEntity completedExamEntity = new CompletedExamEntity(entry.getValue());
            examList.add(completedExamEntity);
        }
        return examList;
    }
}