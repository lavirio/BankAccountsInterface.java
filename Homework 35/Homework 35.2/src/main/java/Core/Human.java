package Core;

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
    private String gender;
    private double weight;
    private double height;
    private List<Pet> petLists = new ArrayList<>();

    public Human(String name, int age, String gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public void petAddToHuman(Pet pet) {
        petLists.add(pet);
    }
}
