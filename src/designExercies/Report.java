package designExercies;

import java.time.LocalDate;

public class Report {
    private static int idCount = 0;

    private int id;

    private int empId;

    private LocalDate hireDate;

    private double salary;

    Report(int empId, LocalDate hireDate, double salary){
        this.id = idCount++;
        this.empId = empId;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee ID : " + empId + " \n" + "Hired on " + hireDate.toString() + "\n" + "Salary : " + salary;
    }

}
