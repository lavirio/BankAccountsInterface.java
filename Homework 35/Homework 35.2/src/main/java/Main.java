import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PetList petList = new PetList();
        Pet pet = new Pet("Vaska","cat", 3);
        Pet pet1 = new Pet("Petka","frog",2);
        Pet pet2 = new Pet("Teddy","dog",5);
        petList.addPet(pet);
        petList.addPet(pet1);
        petList.addPet(pet2);

        Human human = new Human("Petr", 32, 'm', 76.8, 190.0, List.of(petList));

        System.out.println(human);
        System.out.println(pet);
        System.out.println();

        Gson gson = new GsonBuilder().create();

        String humanJson = gson.toJson(human);
        String petJson = gson.toJson(pet);

        System.out.println(humanJson);
        System.out.println(petJson);
        System.out.println();

        Human newHuman = gson.fromJson(humanJson, Human.class);
        Pet newPet = gson.fromJson(petJson, Pet.class);

        System.out.println(newHuman);
        System.out.println(newPet);
        System.out.println();

    }
}
