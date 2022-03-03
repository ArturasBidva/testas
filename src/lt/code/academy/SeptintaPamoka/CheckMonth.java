package lt.code.academy.SeptintaPamoka;

import java.util.Scanner;

import static java.lang.System.out;

public class CheckMonth {
    OnutesSkaiciuotuvoPaleidejas onutesSkaiciuotuvoPaleidejas = new OnutesSkaiciuotuvoPaleidejas();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckMonth checkmonth = new CheckMonth();
        //equalOrNotEqual();
        //findTheString("as esu labas");
        int ivestis = scanner.nextInt();
        checkmonth.fxFunkcija(ivestis);


    }

    public static void equalOrNotEqual() {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        if ((b % 2) == 0) {
            out.println("Skaicius yra lyginis");
        } else {
            out.println("Skaicius nera lyginis");
        }
    }

    public static boolean findTheString(String labas) {
        out.println("Paziurekime ar yra zodis 'labas' jusu sakinyje!");
        if (labas.contains("labas")) {
            out.println("Radau labas!");
            return true;
        }
        out.println("Nera labas :(");
        return false;
    }

    void fxFunkcija(int x) {
        if (x > 0) {
            int suma = (2 * x) + 8;
            out.printf("2x%s+8=%s\n", x, suma);
        } else {
            int suma = 21 - 7 * x;
            out.printf("21-7*%s=%s\n", x, suma);
        }
    }
}
