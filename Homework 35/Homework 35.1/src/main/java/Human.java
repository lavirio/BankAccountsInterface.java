import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Human {
    private String name;
    private int age;
    private char gender;
   private double weight;
    private double height;
    private List <Pet> petLists = new ArrayList<>();

    public Human(String name, int age, char gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public void addPetToHuman(Pet pet){
        petLists.add(pet);
    }
}

