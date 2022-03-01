package lt.code.academy.ketvirtaPamoka;

public class Employer {
    private final String name;
    private final String surname;
   private int salary;
   private int workHours;
    public Employer(String name, String surname) {
        this(0,0, name, surname);

    }

    public Employer(int salary, int workHours, String name, String surname) {
        this.salary = salary;
        this.workHours = workHours;
        this.name = name;
        this.surname = surname;
    }

    public void increaseSalary() {
        salary += 10;
    }

    public void addWorkHours(int hours){
        workHours += hours;
    }

    public String getEmployerInfo() {
        return String.format("%s %s hours: %s h, salary: %s eur",name, surname, workHours, salary);
    }
}
