package lt.code.academy.PapildomosUzduotys;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaxMinNumber maxMinNumber = new MaxMinNumber();
        int[] mas = maxMinNumber.createMasForUser(scanner);
        maxMinNumber.fillUpMas(mas, scanner);

    }

    private int[] createMasForUser(Scanner scanner) {
        System.out.println("iveskite kieki norimu skaiciu");
        int numb = scanner.nextInt();
        int[] mas = new int[numb];
        return mas;
        //return new int[numb];
    }

    private void fillUpMas(int[] mas, Scanner scanner) {
        for (int i = 0; i < mas.length; i++) {
            System.out.printf("iveskite %s skaiciu\n", i);
            mas[i] = scanner.nextInt();
        }
    }

    private int findMinNumber(int[] mas) {
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
            }

        }
        return min;
    }
    private int findMaxNumber(int[] mas) {
        int max = mas[0];
        for(int i = 1; i < mas.length; i++) {
            if(max < mas[i]) {
                max = mas[i];
            }
        } return max;
    }
}
