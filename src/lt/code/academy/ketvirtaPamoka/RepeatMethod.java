package lt.code.academy.ketvirtaPamoka;

public class RepeatMethod {
    private int age;

    public RepeatMethod(int age) {
        this(age, 0);
    }
    public RepeatMethod(int age, int numb){
        this.age = age;
    }


    public static void main(String[] args) {
    RepeatMethod repeatMethod = new RepeatMethod(50);
    RepeatMethod repeatMethod1 = new RepeatMethod(50, 509);
    repeatMethod.m1();
    repeatMethod.m2(10);
    }
    private void m1(){
        int newAge = 10;
        System.out.println(age);
        m2(10);
    }
    private void m2(int value) {
        System.out.println(value);
    }
}
