package designExercies;

import java.util.ArrayList;
import java.util.List;

public class AdminModule {

    public static List<Report> generateReport(List<Employee> employees){
        List<Report> reports = new ArrayList<>();
        for(Employee emp:employees){
            reports.add(new Report(emp.getId(),emp.getHireDate(),emp.getSalary()));
        }

        return reports;
    }
}
