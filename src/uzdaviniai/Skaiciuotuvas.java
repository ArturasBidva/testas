package uzdaviniai;

import java.util.Scanner;

public class Skaiciuotuvas {

    void ivestiPasirinkima(Scanner ivestis2) {
        int pasirinkimas = ivestis2.nextInt();
        switch (pasirinkimas) {
            case 1 -> skaiciuotiStaciojoTrikampioPlota(ivestis2);
            case 2 -> skaiciuotiStaciakampioPlota(ivestis2);
            case 3 -> skaiciuotiKvadratoPlota(ivestis2);
            case 4 -> skaiciuotiApskritimoPlota(ivestis2);
        }
    }

     void skaiciuotiStaciojoTrikampioPlota(Scanner ivestis) {
        System.out.println("Iveskite pirma skaiciu");
        double a = ivestis.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double b = ivestis.nextDouble();
        staciojoTrikampioPlotas(a, b);
    }

     void skaiciuotiStaciakampioPlota(Scanner ivestis) {
        System.out.println("Iveskite pirma skaiciu");
        double a = ivestis.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double b = ivestis.nextDouble();
        staciakampioPlotas(a, b);
    }

     void skaiciuotiKvadratoPlota(Scanner ivestis) {
        System.out.println("Iveskite skaiciu");
        double a = ivestis.nextDouble();
        kvadratoPlotas(a);
    }

     void skaiciuotiApskritimoPlota(Scanner ivestis) {
        System.out.println("Iveskite skaiciu");
        double a = ivestis.nextDouble();
        apskritimoPlotas(a);
    }

    public void pradetiPrograma() {
        Scanner ivestis = new Scanner(System.in);
        while (true) {
            rodytiPasirinkima();
            ivestiPasirinkima(ivestis);
            }
        }

     void rodytiPasirinkima() {
        System.out.println("[1] Staciojo trikampio plotas");
        System.out.println("[2] Staciakampio plotas");
        System.out.println("[3] Kvadrato plotas");
        System.out.println("[4] Apskritimo plotas");
    }

    void staciojoTrikampioPlotas(double a, double b) {
        System.out.println("Staciojo trikampio plotas");
        double rezultatas = (a * b) / 2;
        System.out.println(a + "*" + b + "/" + "2" + "=" + rezultatas);
    }

    void staciakampioPlotas(double a, double b) {
        System.out.println("Staciakampio plotas");
        double rezultatas = a * b;
        System.out.println(a + "*" + b + "=" + rezultatas);
    }

    void kvadratoPlotas(double a) {
        System.out.println("Kvardato plotas");
        double rezultatas = Math.pow(a, 2);
        System.out.println(a + "^" + "2" + "=" + rezultatas);
    }

    void apskritimoPlotas(double a) {
        System.out.println("Apskritimo plotas");
        double rezultatas = Math.pow(a, 2) * Math.PI;
        System.out.println("Pi(31415)" + "*" + "(" + a + "^" + "2" + ")" + "=" + rezultatas);
    }
}