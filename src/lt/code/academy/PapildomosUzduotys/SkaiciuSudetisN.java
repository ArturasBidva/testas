package lt.code.academy.PapildomosUzduotys;

import java.util.Scanner;

public class SkaiciuSudetisN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       SkaiciuSudetisN skaiciuSudetisN = new SkaiciuSudetisN();
       skaiciuSudetisN.skaiciuAtspauzdinimas(scanner);
    }
    void skaiciuAtspauzdinimas(Scanner ivestis) {
        System.out.println("iveskite skaiciu");
        int n = ivestis.nextInt();
        int suma = 0;
        if (n <= 0) {
            System.out.println("Ivedete mazesni skaiciu nei 0");
            skaiciuAtspauzdinimas(ivestis);
            return;
        }
        for (int i = 1; i < n; i++) {
            suma += i;
        }
        System.out.println(suma + n);
    }
}