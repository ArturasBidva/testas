package lt.code.academy.SeptintaPamoka;

import java.util.Scanner;

public class OnutesSkaiciuotuvoPaleidejas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnutesSkaiciuotuvoPaleidejas onutesSkaiciuotuvoPaleidejas = new OnutesSkaiciuotuvoPaleidejas();
        OnutesSkaiciuotuvoMetodai onutesSkaiciuotuvoMetodai = new OnutesSkaiciuotuvoMetodai();
        onutesSkaiciuotuvoMetodai.onutesSkaiciuotuvoPasirinkimai();
        onutesSkaiciuotuvoPaleidejas.ivestiPasirinkima(scanner);

    }

    void ivestiPasirinkima(Scanner ivestis2) {
        OnutesSkaiciuotuvoMetodai onutesSkaiciuotuvoMetodai = new OnutesSkaiciuotuvoMetodai();
        int pasirinkimas = ivestis2.nextInt();
        switch (pasirinkimas) {
            case 1 -> onutesSkaiciuotuvoMetodai.sudetiSkaicius(ivestis2);
            case 2 -> onutesSkaiciuotuvoMetodai.atimintiSkaicius(ivestis2);
            case 3 -> onutesSkaiciuotuvoMetodai.dalintiSkaicius(ivestis2);
            case 4 -> onutesSkaiciuotuvoMetodai.daugintiSkaicius(ivestis2);
            case 5 -> onutesSkaiciuotuvoMetodai.kelimasLaipsniu(ivestis2);
        }
    }
}