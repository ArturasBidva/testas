package lt.code.academy.ketvirtaPamoka;

public class SecondTaskEmployer {
    public static void main(String[] args) {
     Employer employer = new Employer(5000,110,"Petras","Petraitis");
     employer.addWorkHours(10);
     employer.increaseSalary();
     employer.increaseSalary();

        System.out.println(employer.getEmployerInfo());
        employer = new Employer("Petras","Petraitis");
        System.out.println(employer.getEmployerInfo());
    }
}
