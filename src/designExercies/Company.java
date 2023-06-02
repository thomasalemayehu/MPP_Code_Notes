package designExercies;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private static int idCount = 0;
    private int id;

    private String name;

    private List<Department> departments;


    public Company(String name, Department defaultDepartment){
        this.id = idCount++;
        this.name = name;
        departments = new ArrayList<>();
        departments.add(defaultDepartment);
    }

    public List<Department> getDepartments(){
        return this.departments;
    }


    public List<Employee> getEmployees(){
        List<Employee> emps = new ArrayList<>();

        for(Department d:this.departments){
            for(Position p:d.getPositions()){
                emps.add(p.getEmployee());
            }
        }

        return emps;
    }

}
