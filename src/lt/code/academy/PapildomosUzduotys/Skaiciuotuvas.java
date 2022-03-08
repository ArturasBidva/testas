package lt.code.academy.PapildomosUzduotys;

import java.util.Scanner;

public class Skaiciuotuvas {
    public static void main(String[] args) {
        Skaiciuotuvas skaiciuotuvas = new Skaiciuotuvas();
        skaiciuotuvas.pradetiPrograma();


    }

    public void pradetiPrograma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 2 skaicius ir simboli tarp ju");
        String line = scanner.nextLine().replaceAll(" ", "");
        makeAction(line);
    }

    public void makeAction(String line) {
        SkaiciuotuvoViduriai skaiciuotuvoViduriai = new SkaiciuotuvoViduriai();
        int actionIndex = getActionIndex(line);
        char action = line.charAt(actionIndex);
        double a = getNumber(line, 0, actionIndex);
        double b = getNumber(line, actionIndex + 1, line.length());

        switch (action) {
            case '+' -> System.out.println(skaiciuotuvoViduriai.suma(a, b));
            case '-' -> System.out.println(skaiciuotuvoViduriai.skirtumas(a, b));
            case '*' -> System.out.println(skaiciuotuvoViduriai.sandauga(a, b));
        }
    }

    private double getNumber(String line, int startIndex, int endIndex) {
        line = line.substring(startIndex, endIndex);
        return Double.parseDouble(line);
    }

    private int getActionIndex(String line) {
        line = line.replaceAll("[^0-9]", "?");
        return line.indexOf("?");
    }
}
