package lt.code.academy.ketvirtaPamoka;

public class Person {
    private final String name;
    private final String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private void printNameAndSurname(){
        System.out.println(name +" " + surname);
    }
    //Paduoda parametra
    public String getNameAndSurname(){
        return name + " " + surname;
    }
    public String getText(String language) {
        return String.format("As %s %s ismoksiu programuoti %s kalba", name, surname, language);
    }

    @Override
    public String toString() {
        printNameAndSurname();
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
