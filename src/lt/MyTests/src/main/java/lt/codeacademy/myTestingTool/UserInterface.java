package lt.codeacademy.myTestingTool;

import lt.codeacademy.myTestingTool.models.CompletedExam;
import lt.codeacademy.myTestingTool.models.Exam;
import lt.codeacademy.myTestingTool.models.QuestionAndAnswers;
import lt.codeacademy.myTestingTool.models.User;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    int teacherMenu() {
        System.out.println("0. Koreguoti userius");
        System.out.println("1. Koreguoti egzaminus");
        System.out.println("2. Koreguoti klausimus");
        System.out.println("3. Atsijungti");
        return Integer.parseInt(scanner.nextLine());
    }

    void printCompletedExams(Map<Integer, CompletedExam> completedExams) {
        for (Map.Entry<Integer, CompletedExam> entry : completedExams.entrySet()) {
            System.out.println(entry.toString());
        }
    }

    int studentMenu() {
        System.out.println("0. Spresti egzamina");
        System.out.println("1. Atsijungti");
        return Integer.parseInt(scanner.nextLine());
    }

    int editUserSelection() {
        System.out.println("0. Prideti useri");
        System.out.println("1. Istrinti useri");
        System.out.println("2. Pakeisti role");
        System.out.println("3. Perziureti vartotoju sarasa");
        System.out.println("4. Grizti atgal");
        return Integer.parseInt(scanner.nextLine());
    }

    User addUser() {
        System.out.println("Enter username");
        String username = scanner.nextLine();
        System.out.println("Enter name");
        String name = scanner.nextLine();
        return new User(name, username);
    }

    int removeUser(Map<Integer, User> users) {
        System.out.println("Select user");
        System.out.println("--------------------------------");
        System.out.println("User list");
        System.out.println("--------------------------------");
        printUserList(users);
        System.out.println("--------------------------------");
        System.out.println("Enter user id");
        int userId = Integer.parseInt(scanner.nextLine());
        ;
        return userId;
    }

    int editQuestionsSelection() {
        System.out.println("0. Perziureti klausimu sarasa");
        System.out.println("1. Prideti klausima");
        System.out.println("2. Istrinti klausima");
        System.out.println("3. Prideti atsakyma");
        System.out.println("4. Koreguoti teisinga atsakyma");
        System.out.println("5. Grizti atgal");
        return Integer.parseInt(scanner.nextLine());
    }

    int editExamsSelection() {
        System.out.println("0. Perziureti egzminus");
        System.out.println("1. Prideti egzamina");
        System.out.println("2. Prideti klausima i egzamina");
        System.out.println("3. Perziureti egzaminu rezultatus");
        System.out.println("4. Grizti atgal");
        return Integer.parseInt(scanner.nextLine());
    }

    void printUserList(Map<Integer, User> users) {
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            System.out.println(entry.toString());
        }
    }

    int getUserId() {
        System.out.println("Enter user id");
        return Integer.parseInt(scanner.nextLine());
    }

    int getRoleId() {
        System.out.println("Enter user id");
        return Integer.parseInt(scanner.nextLine());
    }

    void printQuestions(Map<Integer, QuestionAndAnswers> questionAndAnswers) {
        for (Map.Entry<Integer, QuestionAndAnswers> entry : questionAndAnswers.entrySet()) {
            System.out.println(entry.toString());
        }
    }

    void printExams(List<Exam> examList) {
        System.out.println(examList.toString());
    }
}
