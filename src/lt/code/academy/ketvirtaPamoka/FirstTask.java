package lt.code.academy.ketvirtaPamoka;

public class FirstTask {
    public static void main(String[] args) {
        Person person = new Person("Arturas","Bidva", 50);
        person.setAge(100);
        System.out.println(person);
        System.out.println(person.getNameAndSurname());
        System.out.println(person.getText("Java"));
    }
}
