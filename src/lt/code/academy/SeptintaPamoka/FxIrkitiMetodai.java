package lt.code.academy.SeptintaPamoka;

import java.util.Scanner;

import static java.lang.System.out;

public class FxIrkitiMetodai {

    public static void main(String[] args) {
        FxIrkitiMetodai fxIrkitiMetodai = new FxIrkitiMetodai();
        Scanner scanner = new Scanner(System.in);
        fxIrkitiMetodai.equalOrNotEqual();
        fxIrkitiMetodai.findTheString("labas, mano vardas Arturas.");
        fxIrkitiMetodai.fxFunkcija(scanner);
    }

    void equalOrNotEqual() {
        out.println("Iveskite skaiciu ir programa pasakys ar skaicius lyginis ar ne");
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        if ((b % 2) == 0) {
            out.println("Skaicius yra lyginis");
        } else {
            out.println("Skaicius nera lyginis");
        }
    }

    boolean findTheString(String labas) {
        out.println("Paziurekime ar yra zodis 'labas' jusu sakinyje!");
        if (labas.contains("labas")) {
            out.println("Radau labas!");
            return true;
        } else {
            out.println("Nera labas :(");
            return false;
        }
    }

    void fxFunkcija(Scanner ivestis) {
        out.println("(fx)Funkcija , iveskite X ir pagal tai gausite atsakyma");
        int x = ivestis.nextInt();
        if (x > 0) {
            int suma = (2 * x) + 8;
            out.printf("2x%s+8=%s\n", x, suma);
        } else {
            int suma = 21 - 7 * x;
            out.printf("21-7*%s=%s\n", x, suma);
        }
    }
}
