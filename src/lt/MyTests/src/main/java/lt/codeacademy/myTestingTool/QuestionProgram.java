package lt.codeacademy.myTestingTool;

import lt.codeacademy.myTestingTool.models.Exam;
import lt.codeacademy.myTestingTool.models.QuestionAndAnswers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuestionProgram {

    int start(Exam exam) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> userSelections = new HashMap<>();
        System.out.println("Egzaminas " + exam.getName());
        for (QuestionAndAnswers questionAndAnswers : exam.getQuestionList()) {
            System.out.println(questionAndAnswers.toQuestion());
            for (int i = 0; i < questionAndAnswers.getAnswers().size(); i++) {
                System.out.println(i + ". " + questionAndAnswers.getAnswers().get(i));
            }
            int userInput = Integer.parseInt(scanner.nextLine());
            userSelections.put(questionAndAnswers.getId(), userInput);
        }
        return rateExam(exam, userSelections);
    }

    int rateExam(Exam exam, Map<Integer, Integer> userSelections) {
        int questionAmount = exam.getQuestionList().size();
        int rightAnswerAmount = 0;
        for (QuestionAndAnswers questionAndAnswers : exam.getQuestionList()) {
            int userSelection = userSelections.get(questionAndAnswers.getId());
            if (questionAndAnswers.getRightAnswerIndex() == userSelection) {
                rightAnswerAmount++;
            }
        }
        System.out.println("Right answer amount" + " " + rightAnswerAmount);
        int percentage = 100 - questionAmount / rightAnswerAmount * 10;
        System.out.println("Percentage" + " " + percentage);
        return percentage/ 10;
    }
}