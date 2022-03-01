package lt.code.academy.PenktaPamoka;

import java.util.*;

public class Uzduotys {
    public static void main(String[] args) {
        String text = "Namas";
        atspauzdintiKeturzenkliSkaiciu();
        atspauzdintiTeksta();
        atspauzdintiTekstaDu();
        atspauzdintiIvestaTeksta();
        atspauzdintiIvestusSkaicius();
        atspauzdintiVidurki();
        Ivestis();
        atspauzdintiSukeistusSkaicius();
        Uzduotys uzduotys = new Uzduotys();
        text = uzduotys.changeOne(text,'s', 'i');
        text = uzduotys.changeTwo(text);
        text = uzduotys.changeThree(text);
        text = uzduotys.changeFour(text);
        text = uzduotys.changeOne(text,'m', 'n');
        uzduotys.changeFive(text, 'n');

    }
    public static void Ivestis() {
        Scanner scanner = new Scanner(System.in);
        int ivestis = scanner.nextInt();
        int ivestis1 = scanner.nextInt();
        int sum = ivestis + ivestis1;
        System.out.println(sum);

    }

    public static void atspauzdintiTeksta() {
        System.out.println("Pirmoji programa!");
    }

    public static void atspauzdintiTekstaDu() {
        System.out.println("Mokausi programuoti " + '"' + "Java" + '"');

    }

    public static void atspauzdintiIvestaTeksta() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");
        int a = in.nextInt();
        System.out.println("Jus ivedete skaiciu " + a);

    }

    public static void atspauzdintiIvestusSkaicius() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite du skaicius.");
        int a = in.nextInt();
        int b = in.nextInt();
        int s = a + b;
        System.out.println(s);
    }

    public static void atspauzdintiVidurki() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite du skaicius.");
        int a = in.nextInt();
        int b = in.nextInt();
        int s = a / b;
        System.out.println(s);
    }

    public static void atspauzdintiSukeistusSkaicius() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite du skaicius.");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = b;
        a = b;
        c = a;
    }

    public static void atspauzdintiKeturzenkliSkaiciu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Keturzenklis");
        String a = String.valueOf(in.nextLine());
        String firstFourChars;
        if (a.length() > 4) {
            firstFourChars = a.substring(0, 4);
        } else {
            firstFourChars = a;
        }
        System.out.println(firstFourChars);
    }

    private String changeOne(String text, char oldLetter, char newLetter) {
        String changed = text.replace(oldLetter, newLetter);
        System.out.printf("\"%s\" -> \"%s\"\n",text, changed);
        return changed;
    }
    private String changeTwo(String text) {
     String changed = text.toUpperCase();
        System.out.printf("%s -> %s\n", text, changed);
        return changed;
    }
    private String changeThree(String text) {
        String changed = text.substring(2,4);
        System.out.printf("%s -> %s\n", text, changed);
        return changed;
    }
    private String changeFour(String text) {
        String changed = text.concat(text.toLowerCase());
        System.out.printf("%s -> %s\n", text, changed);
        return changed;
    }
    private void changeFive(String text,char letter) {
        System.out.printf("%s -> %s\n",text, text.indexOf(letter));
    }


}