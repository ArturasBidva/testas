package lt.codeacademy.myTestingTool;

import lt.codeacademy.myTestingTool.models.CompletedExam;
import lt.codeacademy.myTestingTool.models.Exam;
import lt.codeacademy.myTestingTool.models.Teacher;
import lt.codeacademy.myTestingTool.models.User;
import lt.codeacademy.myTestingTool.repositories.*;

import java.util.Scanner;

public class MainInterface {
    UserRepository userRepository = new UserRepository();
    QuestionsRepository questionsRepository = new QuestionsRepository();
    ExamRepository examRepository = new ExamRepository();
    UserInterface interfaces = new UserInterface(new Scanner(System.in));
    CompletedExamRepository completedExamRepository = new CompletedExamRepository();
    QuestionProgram questionProgram = new QuestionProgram();
    Scanner scanner = new Scanner(System.in);

    void start() {
        System.out.println("Prisijunkite");
        User user;
        while (true) {
            String username = scanner.nextLine();
            user = userRepository.getByUsername(username);
            if (user != null)
                break;
            else {
                System.out.println("Neteisingas vartotojas");
            }
        }
        showMenuByUser(user);
    }

    private void showMenuByUser(User user) {
        if (user instanceof Teacher) {
            int selection = interfaces.teacherMenu();
            switch (selection) {
                case 0: {
                    editUsers(user);
                    break;
                }
                case 1: {
                    editExams(user);
                    break;
                }
                case 2: {
                    editQuestion(user);
                    break;
                }
                case 3: {
                    start();
                    break;
                }
            }
        } else {
            int selection = interfaces.studentMenu();
            switch (selection) {
                case 0: {
                    System.out.println("Iveskite egzamino id: ");
                    int ivestis = Integer.parseInt(scanner.nextLine());
                    Exam exam = examRepository.getExamById(ivestis);
                    int grade = questionProgram.start(exam);
                    System.out.println(grade);
                    completedExamRepository.add(new CompletedExam(exam, user, grade));
                    break;
                }
                case 1: {
                    start();
                    break;
                }
            }
        }
    }

    private void editUsers(User user) {
        int selection;
        selection = interfaces.editUserSelection();
        switch (selection) {
            case 0: {
                User user1 = interfaces.addUser();
                userRepository.add(user1);
                break;
            }
            case 1: {
                int userId = interfaces.removeUser(userRepository.getUsers());
                userRepository.remove(userId);
                break;
            }
            case 2: {
                editRole(user);
            }
            case 3: {
                interfaces.printUserList(userRepository.getUsers());
            }
            case 4: {
                showMenuByUser(user);
            }
        }
        editUsers(user);
    }

    private void editRole(User user) {
        interfaces.printUserList(userRepository.getUsers());
        int userId = interfaces.getUserId();
        int roleId = interfaces.getRoleId();
        if (!userRepository.changeRole(userId, roleId)) {
            System.out.println("Incorrect user or role");
        }
        editUsers(user);
    }


    private void editQuestion(User user) {
        int selection;
        selection = interfaces.editQuestionsSelection();
        switch (selection) {
            case 0: {
                interfaces.printQuestions(questionsRepository.getQuestions());
                break;
            }
            case 1: {
                System.out.println("Enter question");
                String question = scanner.nextLine();
                questionsRepository.addQuestion(question);
                break;
            }
            case 2: {
                interfaces.printQuestions(questionsRepository.getQuestions());
                System.out.println("Enter question id");
                int questionId = Integer.parseInt(scanner.nextLine());
                questionsRepository.removeQuestion(questionId);
                break;
            }
            case 3: {
                interfaces.printQuestions(questionsRepository.getQuestions());
                System.out.println("Enter question id:");
                int questionId = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter answer");
                String answer = scanner.nextLine();
                questionsRepository.addAnswer(questionId, answer);
                break;
            }
            case 4: {
                System.out.println("Enter question id");
                int questionId = Integer.parseInt(scanner.nextLine());
                System.out.println(questionsRepository.getById(questionId));
                int rightAnswerNumber = Integer.parseInt(scanner.nextLine());
                questionsRepository.setRightAnswer(questionId, rightAnswerNumber);
                break;
            }
            case 5: {
                showMenuByUser(user);
                break;
            }
        }
        editQuestion(user);
    }

    void editExams(User user) {
        int selection;
        selection = interfaces.editExamsSelection();
        switch (selection) {
            case 0: {
                interfaces.printExams(examRepository.getExams());
                break;
            }
            case 1: {
                System.out.println("Enter type");
                String type = scanner.nextLine();
                System.out.println("Enter name");
                String name = scanner.nextLine();
                examRepository.addExam(name, type);
                break;
            }
            case 2: {
                interfaces.printQuestions(questionsRepository.getQuestions());
                System.out.println("Enter exam id");
                int examId = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter question id");
                int questionId = Integer.parseInt(scanner.nextLine());
                examRepository.addQuestionToExam(examId, questionId);
                break;
            }
            case 3: {
                interfaces.printCompletedExams(completedExamRepository.getCompletedExamMap());
                break;
            }
            case 4: {
                showMenuByUser(user);
                break;
            }
        }
        editExams(user);
    }
}