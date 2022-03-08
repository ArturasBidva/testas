package lt.code.academy.AstuntaPamoka;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int number = scanner.nextInt();
        SecondTask secondTask = new SecondTask();
        secondTask.calculateFunction(number);
    }
    private void calculateFunction(int number) {
        int f;
        if(number >= 0){
            f = 2*number +8;
        } else {
            f = 21 - (7 * number);
        }
        System.out.printf("Rezultatas yra: %s", f);
    }
}
