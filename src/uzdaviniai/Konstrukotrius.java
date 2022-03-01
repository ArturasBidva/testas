package uzdaviniai;

public class Konstrukotrius {
    public static void main(String[] args) {
        Person person = new Person("Arturas", 45);
        person.printValues();

        Person person1 = new Person("Petras");
        person1.printValues();
    }
}
