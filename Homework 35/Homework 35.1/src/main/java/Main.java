import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PetList petList = new PetList();
        Pet pet = new Pet("Барсик", "кошка", 3);
        Pet pet1 = new Pet("Васька", "собака", 5);
        Pet pet2 = new Pet("Саня", "лемур", 2);

        petList.addPets(pet);
        petList.addPets(pet1);
        petList.addPets(pet2);

        Human human = new Human("Петр",18,'м',67.5,183.3, List.of(petList));
        System.out.println(pet);
        System.out.println(human);
        System.out.println();

        Gson gson = new GsonBuilder().create();

        String humanJson = gson.toJson(human);
        String petJson = gson.toJson(pet);
        System.out.println(humanJson);
        System.out.println(petJson);
        System.out.println();

        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String petsListJson = gson1.toJson(petList);
        System.out.println(petsListJson);
    }
}
