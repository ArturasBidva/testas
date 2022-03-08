package lt.code.academy.enumm;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println(Days.ANTRADIENIS);

        Days days = Days.getDayByNumber(2);

        System.out.println(days.getNumber());
        System.out.println(days.getName());
    }
}
