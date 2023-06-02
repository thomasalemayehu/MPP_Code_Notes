package designExercies;

import java.time.LocalDate;

public class Employee {
    private static int idCount = 0;

    private final int id;

    private String title;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private final LocalDate hireDate;

    private double salary;

    private int ssn;


    Employee(String title, String firstName, String lastName, LocalDate dateOfBirth, LocalDate hireDate, double salary, int ssn){
        this.id = idCount++;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
        this.salary = salary;
        this.ssn = ssn;
    }

    public int getId() {
        return id;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
