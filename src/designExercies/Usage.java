package designExercies;

import java.time.LocalDate;
import java.util.List;

public class Usage {
    public static void main(String[] args) {
        Employee e1 = new Employee("Developer","A","A",LocalDate.parse("2000-12-12"), LocalDate.parse("2023-10-04"),20_000,123);
        Employee e2 = new Employee("Project Manager","B","B",LocalDate.parse("2000-05-05"), LocalDate.parse("2023-10-04"),25_000,1234);
        Employee e3 = new Employee("General Manager","C","C",LocalDate.parse("1988-01-11"), LocalDate.parse("2023-08-04"),35_000,12345);

        Position manager = new Position("General Manager","Top Level");
        manager.addEmployee(e3);

        Position projectManager = new Position("Project Manager","Mid Level");
        projectManager.addEmployee(e2);

        Position developer = new Position("Developer","No Level");
        developer.addEmployee(e1);

        Department seDept = new Department("Software Department","Addis Ababa,Ethiopia",developer);
        seDept.addPosition(manager);
        seDept.addPosition(projectManager);


        Company c = new Company("Kin Ideas",seDept);

        List<Report> reports = AdminModule.generateReport(c.getEmployees());

        for(Report r:reports){
            System.out.println(r);
            System.out.println("*******************");
        }
    }
}
