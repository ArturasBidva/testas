package lt.code.academy.PapildomosUzduotys;

import java.util.Scanner;

public class VardoSpausdinimas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VardoSpausdinimas vardoSpausdinimas = new VardoSpausdinimas();
        vardoSpausdinimas.atspausdinti(scanner);
    }
    void atspausdinti(Scanner ivestis) {
        String vardas = ivestis.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(vardas);
        }
    }
}
