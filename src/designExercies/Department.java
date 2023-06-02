package designExercies;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private static int idCount=0;

    private int id;

    private String name;

    private String location;

    private List<Position> positions;

    Department(String name,String location,Position defaultPosition){
        this.id = idCount++;
        this.name = name;
        this.location = location;
        this.positions = new ArrayList<>();
        positions.add(defaultPosition);
    }

    public List<Position> getPositions(){
        return this.positions;
    }


    public void addPosition(Position p){
        this.positions.add(p);
    }

}
