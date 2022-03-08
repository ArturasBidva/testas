package lt.code.academy.DevintaPamoka;

import java.util.Arrays;
import java.util.Scanner;

public class Pasikartojimas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pasikartojimas pasikartojimas = new Pasikartojimas();
        //int a = scanner.nextInt();
        //int b = scanner.nextInt();
        //int c = scanner.nextInt();
        //pasikartojimas.biggestNumber(a,b,c);
        //pasikartojimas.skaiciuVidurkis(a,b,c);
        pasikartojimas.masyvas(scanner);

    }

    void biggestNumber(int a , int b , int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else System.out.println(c);
    }
    void skaiciuVidurkis(int a , int b , int c) {
        int vidurkis = (a+b+c)/3;
        System.out.println(vidurkis);
    }
    void masyvas(Scanner ivestis) {
        int[] array = new int[10];
        for(int i = 0; i < 10; i++) {
            array[i] = ivestis.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Min" + array[0]);
        System.out.println("Max" + array[array.length-1]);
        }
    }