package lt.code.academy.task;

import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        //String[] mass = new String[10];
        //mass[0] = "Andrius";

        String[] mass = {"Andrius", "Petras", "Jonas", "Antanas", "Ona"};
        System.out.printf("%s-%s-%s\n",mass[0].toUpperCase(),mass[0].length(), 0);
        System.out.printf("%s-%s-%s\n",mass[1].toUpperCase(),mass[1].length(), 1);
        System.out.printf("%s-%s-%s\n",mass[2].toUpperCase(),mass[2].length(), 2);
        System.out.printf("%s-%s-%s\n",mass[3].toUpperCase(),mass[3].length(), 3);
        System.out.printf("%s-%s-%s\n",mass[4].toUpperCase(),mass[4].length(), 4);
        System.out.println("Iveskite kokio ilgio noretumet masyvo");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int myArray[] = new int [size];
        myArray[0] = size;
        myArray[myArray.length-1]=size;
        for(int i : myArray) {
            System.out.println(i);
        }
    }

}
