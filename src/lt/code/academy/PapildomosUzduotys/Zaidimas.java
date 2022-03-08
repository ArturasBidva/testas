package lt.code.academy.PapildomosUzduotys;

import java.util.Random;
import java.util.Scanner;

public class Zaidimas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zaidimas zaidimas = new Zaidimas();
        zaidimas.randomNumber(scanner);

    }
    int randomNumber(Scanner ivestis) {
        System.out.println("Atspek skaiciu nuo 1 iki 10");
        int x = ivestis.nextInt();
        Random rand = new Random();
        int randomNumber  = rand.nextInt(10) + 1;
        if(x == randomNumber) {
            System.out.println("Tu atspejei skaiciu!");
        } else if (x == 0) {
            System.out.println("Programa isjungiama");
        } else {
            System.out.println("Neatspejei, bandyk dar karta");
            return randomNumber(ivestis);

        }
        return x;
    }
}
