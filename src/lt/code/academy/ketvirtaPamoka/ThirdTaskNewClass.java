package lt.code.academy.ketvirtaPamoka;

public class ThirdTaskNewClass {

    public double triangle(double a, double b) {
        return (a * b) / 2;
    }

    public double rectangle(double a, double b) {
        return (a * b);
    }
    //package private example
    double square(double a) {
        return Math.pow(a, 2);
    }

    double circle(double a) {
        return Math.pow(a, 2) * Math.PI;
    }
}