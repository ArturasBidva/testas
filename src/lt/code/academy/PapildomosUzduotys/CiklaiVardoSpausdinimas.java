package lt.code.academy.PapildomosUzduotys;

import java.util.Scanner;

public class CiklaiVardoSpausdinimas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CiklaiVardoSpausdinimas ciklaiVardoSpausdinimas = new CiklaiVardoSpausdinimas();
        ciklaiVardoSpausdinimas.whileCiklas(scanner);

    }
    void whileCiklas(Scanner ivestis) {
        while (true) {
            String vardas;
            System.out.println("Iveskite zodi");
            vardas = ivestis.nextLine();
            System.out.println(vardas);
            if (vardas.equals("pabaiga")) {
                break;
            }
        }
        }
    }
