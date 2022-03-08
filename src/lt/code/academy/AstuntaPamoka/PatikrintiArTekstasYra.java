package lt.code.academy.AstuntaPamoka;

import java.util.Scanner;

public class PatikrintiArTekstasYra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite teksta");
        String line = scanner.nextLine();
        System.out.println("Iveskite ieskoma zodi:");
        String word = scanner.nextLine();

        PatikrintiArTekstasYra patikrintiArTekstasYra = new PatikrintiArTekstasYra();
        patikrintiArTekstasYra.findAndPrintWord(line, word);
    }

    private void findAndPrintWord(String line, String word) {
        if (line.toUpperCase().contains(word.toLowerCase())) {
            System.out.printf("%s zodzis yra tekste\n", word);
        } else {
            System.out.printf("%s zodzio nera tekste\n", word);
        }
    }
}