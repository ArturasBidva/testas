package uzdaviniai;

public class UzdavinysNr6 {
    public static void main(String[] args) {
        double d1 = kaina();
        double d2 = antraKaina(100);
        double result = sudetiSuma(d1, d2);
        System.out.println(result);
    }

    public static double kaina() {
        return 100;

    }

    public static double antraKaina(double suma) {
        return suma;
    }
    public static double sudetiSuma(double numb, double secondNumb) {
        return numb + secondNumb;
    }
}
