package lt.code.academy.SeptintaPamoka;

import java.util.Scanner;
import static java.lang.System.out;

public class OnutesSkaiciuotuvoMetodai {
    OnutesSkaiciuotuvoPaleidejas onutesSkaiciuotuvoPaleidejas = new OnutesSkaiciuotuvoPaleidejas();

    void pradetiPrograma() {
        Scanner ivestis = new Scanner(System.in);
        while (true) {
            onutesSkaiciuotuvoPasirinkimai();
            onutesSkaiciuotuvoPaleidejas.ivestiPasirinkima(ivestis);
        }
    }

    void onutesSkaiciuotuvoPasirinkimai() {
        out.println("[1] Sumos apskaiciavimas");
        out.println("[2] Skirtumo apskaiciavimas");
        out.println("[3] Dalybos apskaiciavimas");
        out.println("[4] Daugybos apskaiciavimas");
        out.println("[5] Kelimas laipsniu apskaiciavimas");
    }

    void sudetiSkaicius(Scanner ivestis) {
        System.out.println("Iveskite pirma skaiciu");
        double a = ivestis.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double b = ivestis.nextDouble();
        if (a < 0 || b < 0) {
            out.println("Ivedete blogus skaicius");
            sudetiSkaicius(ivestis);
        }
        sudetiSuma(a, b);
    }

    void sudetiSuma(double a, double b) {
        double atsakymas = a + b;
        out.printf("atsakymas:%s\n", atsakymas);
    }

    void atimintiSkaicius(Scanner ivestis) {
        System.out.println("Iveskite pirma skaiciu");
        double a = ivestis.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double b = ivestis.nextDouble();
        if (a < 0 || b < 0) {
            out.println("Ivedete blogus skaicius");
            atimintiSkaicius(ivestis);
        }
        atimtiSuma(a, b);
    }

    void atimtiSuma(double a, double b) {
        double atsakymas = a - b;
        out.printf("atsakymas:%s\n", atsakymas);
    }

    void dalintiSkaicius(Scanner ivestis) {
        System.out.println("Iveskite pirma skaiciu");
        double a = ivestis.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double b = ivestis.nextDouble();
        if (a < 0 || b < 0) {
            out.println("Ivedete blogus skaicius");
            dalintiSkaicius(ivestis);
        }
        dalintiSuma(a, b);
    }

    void dalintiSuma(double a, double b) {
        double atsakymas = a / b;
        out.printf("atsakymas:%s\n", atsakymas);
    }

    void daugintiSkaicius(Scanner ivestis) {
        System.out.println("Iveskite pirma skaiciu");
        double a = ivestis.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double b = ivestis.nextDouble();
        if (a < 0 || b < 0) {
            out.println("Ivedete blogus skaicius");
            daugintiSkaicius(ivestis);
        }
        daugintiSuma(a, b);
    }

    void daugintiSuma(double a, double b) {
        double atsakymas = a * b;
        out.printf("atsakymas:%s\n", atsakymas);
    }

    void kelimasLaipsniu(Scanner ivestis) {
        System.out.println("Iveskite pirma skaiciu");
        double a = ivestis.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double b = ivestis.nextDouble();
        if (a < 0 || b < 0) {
            out.println("Ivedete blogus skaicius");
            kelimasLaipsniu(ivestis);
        }
        kelimasLaipsniuSuma(a, b);
    }

    void kelimasLaipsniuSuma(double a, double b) {
        double atsakymas = Math.pow(a, b);
        out.printf("atsakymas:%s\n", atsakymas);
    }
}