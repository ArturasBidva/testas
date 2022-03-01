package lt.code.academy.SestaPamoka;

import java.util.Scanner;

public class PirmasPratimas {
    public static void main(String[] args) {
        PirmasPratimas task = new PirmasPratimas();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 2 skaicius ir simboli tarp ju");

        String line = scanner.nextLine();
        task.firstSum(line);
        task.secondSum(line);

    }
    private void firstSum(String line) {
        // 10 + 10
        int a = Integer.parseInt(line.substring(0, 2).trim());
        int b = Integer.parseInt(line.substring(line.length() -3).trim());
        System.out.println("Suma yra " + (a + b));
    }
    private void secondSum(String line) {
        //5000 + 5 '' 55 + 66666
        int index = line.indexOf("+");
        int a = Integer.parseInt(line.substring(0, index).trim());
        int b = Integer.parseInt(line.substring(index + 1).trim());
        System.out.println("Suma yra " + (a + b));
    }
}
