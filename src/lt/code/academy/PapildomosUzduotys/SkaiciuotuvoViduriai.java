package lt.code.academy.PapildomosUzduotys;

import java.util.Scanner;

public class SkaiciuotuvoViduriai {
    Scanner scanner = new Scanner(System.in);
    Skaiciuotuvas skaiciuotuvas = new Skaiciuotuvas();

    double suma(double a, double b) {
        System.out.println(a + b);
        System.out.println("Ar noretumete pakartoti, jeigu taip , iveskite 5");
        int x = scanner.nextInt();
        if (x == 5) {
            skaiciuotuvas.pradetiPrograma();
        } else {
            System.out.println("Jusu praeiti atsakymai:");
        }
        return a + b;
    }

    double skirtumas(double a, double b) {
        System.out.println(a - b);
        System.out.println("Ar noretumete pakartoti, jeigu taip, iveskite 5");
        int x = scanner.nextInt();
        if (x == 5) {
            skaiciuotuvas.pradetiPrograma();
        } else {
            System.out.println("Jusu praeiti atsakymai:");
        }
        return a - b;
    }

    double sandauga(double a, double b) {
        System.out.println(a * b);
        System.out.println("Ar noretumete pakartoti, jeigu taip, iveskite 5");
        int x = scanner.nextInt();
        if (x == 5) {
            skaiciuotuvas.pradetiPrograma();
        } else {
            System.out.println("Jusu praeiti atsakymai:");
        }
        return a * b;
    }
}