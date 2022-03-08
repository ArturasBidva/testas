package lt.code.academy.PapildomosUzduotys;

import java.util.Scanner;

public class Masyvai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Masyvai masyvai = new Masyvai();
        double mase = 0;
        double ugis = 0;
        //masyvai.masyvai(scanner);
        //masyvai.zodziuMasyvai(scanner);
        //masyvai.masesIndeksas(scanner);
        //masyvai.skaiciuIvedimas(scanner);
        //masyvai.maseUgisIndeksas(96,1.96);
        masyvai.masyvoAtvaizdavimas(scanner);
    }

    void masyvai(Scanner ivestis) {
        int[] mass = new int[5];
        mass[0] = ivestis.nextInt();
        mass[1] = ivestis.nextInt();
        mass[2] = ivestis.nextInt();
        mass[3] = ivestis.nextInt();
        mass[4] = ivestis.nextInt();
        int suma = mass[0] + mass[1] + mass[2] + mass[3] + mass[4];
        System.out.printf("%s {%s, %s, %s , %s , %s}\n", suma, mass[0], mass[1], mass[2], mass[3], mass[4]);
    }

    void zodziuMasyvai(Scanner ivestis) {
        String[] zodziai = new String[5];
        zodziai[0] = ivestis.nextLine();
        zodziai[1] = ivestis.nextLine();
        zodziai[2] = ivestis.nextLine();
        zodziai[3] = ivestis.nextLine();
        zodziai[4] = ivestis.nextLine();
        System.out.printf("%s %s %s %s %s\n", zodziai[0], zodziai[1], zodziai[2], zodziai[3], zodziai[4]);
    }

    void masesIndeksas(Scanner ivestis) {
        double[] mass = new double[2];
        System.out.println("Iveskite savo svori");
        mass[0] = ivestis.nextDouble();
        System.out.println("Iveskite savo ugi");
        mass[1] = ivestis.nextDouble();
        double x = mass[1];
        double kmi = mass[0] / Math.pow(x, 2);
        System.out.println(kmi);
    }

    void skaiciuIvedimas(Scanner ivestis) {
        int mass;
        System.out.println("Kiek skaiciu ketinate ivesti?");
        mass = ivestis.nextInt();
        int[] array = new int[mass];
        System.out.println("Iveskite tiek skaiciu kiek pasirinkote");
        for (int i = 0; i < mass; i++) {
            array[i] = ivestis.nextInt();
        }
        for (int i = 0; i < mass; i++) {
            if (array[i] > 100) {
                System.out.println("Didziausias skaicius" + array[i]);
            }
        }
    }
    double maseUgisIndeksas(double mase, double ugis) {
        double indeksas = mase / Math.pow(ugis,2);
        System.out.println(indeksas);
        return indeksas;
    }
    int masyvoAtvaizdavimas(Scanner ivestis) {
        System.out.println("Kiek skaiciu ketinate ivesti?");
        int skaiciai = ivestis.nextInt();
        int[] array = new int[skaiciai];
        System.out.println("Iveskite tiek skaiciu kiek pasirinkote");
        for(int i = 0; i < skaiciai; i++){
            array[i] = ivestis.nextInt();
        } for (int i = 0; i< skaiciai; i++){
            if (array[i]> 100){
                System.out.println("Didziausias skaicius" + array[i]);
            }
        }
        return skaiciai;
    }
}
