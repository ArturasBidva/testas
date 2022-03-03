package lt.code.academy.SeptintaPamoka;

public class OperatorExample {
    public static void main(String[] args) {
        boolean first = true;
        boolean second = false;

        int a = 2;
        int b = 5;

        String text = "aa";
        String secondText = "ab";

        System.out.println(!first);
        System.out.println(!second && !first);
    }


    private static boolean isNumberBigger(int a, int b) {
        return a > b;
    }
}
