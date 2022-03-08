package lt.code.academy.AstuntaPamoka;

public class Calculator {

    double sum(double a, double b) {
        return a + b;
    }
    double minus(double a, double b) {
        return a - b;
    }
    double divider(double a, double b){
        if(b == 0) {
            System.out.println("Dalyba is nulio negalima");
            return 0;
        }
        return a / b;
    }

    double multiply(double a, double b){
        return a * b;
    }
    double pow(double a, int number){
        return Math.pow(a, number);
    }
}
