package uzdaviniai;

public class Person {
    String name;
    int age;
    public Person(String name) {
        this(name,0);
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printValues(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}
