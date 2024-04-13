import java.time.Year;
import java.util.Date;

public class Building {
    private String name;
    private Integer createdIn, numberOfFloors;

    public Building(String name, Integer createdIn, Integer numberOfFloors) {
        this.name = name;
        this.createdIn = createdIn;
        this.numberOfFloors = numberOfFloors;
    }

    public void showDetails(){
        System.out.format("Building name: %s \n", name);
        System.out.format("Created in %d year \n", createdIn);
        System.out.format("Contains %d floors \n", numberOfFloors);
    }

    public void howOldIsBuilding(){
        int age = Year.now().getValue() - this.createdIn;
        System.out.format("Building is %d years old \n", age);
    }
}
