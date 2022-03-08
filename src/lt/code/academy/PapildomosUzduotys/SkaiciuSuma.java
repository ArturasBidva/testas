package lt.code.academy.PapildomosUzduotys;

import java.util.Scanner;

public class SkaiciuSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SkaiciuSuma skaiciuSuma = new SkaiciuSuma();
        skaiciuSuma.skaiciuSuma(scanner);


    }
    void skaiciuSuma(Scanner skaiciai) {
        int suma = 0;
        while(true) {
            int ivestis;
            System.out.println("Iveskite skaiciu");
            ivestis = skaiciai.nextInt();
            suma += ivestis;
            if (ivestis == 0) {
                System.out.println(suma);
                break;
            }

        }
    }
}
