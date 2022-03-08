package lt.code.academy.DevintaPamoka;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WhileLoopExample whileLoopExample = new WhileLoopExample();
        //whileLoopExample.skaiciuIvedimas(scanner);
        whileLoopExample.jonukoMetodas();
    }

    void skaiciuIvedimas(Scanner ivestis) {
        while (true) {
            int x;
            System.out.println("Iveskite skaiciu");
            x = ivestis.nextInt();
            System.out.println(x);
            if (x == 0) {
                break;
            }
        }
    }

    void jonukoMetodas() {
        String pirmas = "KOL EINU SUNIE LOK";
        String reverse = "";
        String antras = "ARGI TEN NE TIGRA";
        String trecias = "SEDEK UZU KEDES";
        String pirmass = pirmas.replace(" ", "");
        String antrass = antras.replace(" ", "");
        String treciass = trecias.replace(" ", "");
        int lenght = pirmass.length();
        for (int i = (lenght - 1); i >= 0; i--) {
            reverse = reverse + pirmass.charAt(i);
            System.out.println(reverse);
        }
        if (pirmass.equals(reverse)) {
            System.out.println("tinka");
        } else {
            System.out.println("netinka");
        }
    }
}

