package lt.code.academy.PapildomosUzduotys;

import java.util.Scanner;

public class LaimingasBilietas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LaimingasBilietas laimingasBilietas = new LaimingasBilietas();
        laimingasBilietas.bilietoIvestis(scanner);

    }
    void bilietoIvestis(Scanner ivestis){
        System.out.println("Iveskite bilieto skaicius[6 simboliai]");
        String bilietas = ivestis.next();
        int[] bilietoSkaiciai = new int[6];
        for(int i = 0; i < bilietas.length(); i++){
            Character.getNumericValue(bilietas.charAt(i));
            bilietoSkaiciai[i] = Character.getNumericValue(bilietas.charAt(i));
            //System.out.println(bilietoSkaiciai[i]);
        }
        int pirmaSuma = bilietoSkaiciai[0]+bilietoSkaiciai[1]+bilietoSkaiciai[2];
        int antraSuma = bilietoSkaiciai[3]+bilietoSkaiciai[4]+bilietoSkaiciai[5];
        if(pirmaSuma == antraSuma){
            System.out.println("Laimejei loterija");
        }else {
            System.out.println("Bandyk dar karta");
        }
    }

}
