package designExercies;

public class Position {
    private static int idCount=0;

    private int id;

    private String title;

    private String description;

    private Employee employee;

    Position(String title, String description){
        this.id = idCount++;
        this.title = title;

        this.description = description;
    }


    public void addEmployee(Employee e){
        if(this.employee == null) this.employee = e;
    }

    public Employee getEmployee(){
        return  this.employee;
    }
}
