import Core.Human;
import Core.Pet;
import Deserializer.HumanDeserializer;
import Deserializer.PetDeserializer;
import Serializer.HumanSerializer;
import Serializer.PetSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Petr", 32, "m", 76.8, 190.0);

        Pet pet = new Pet("Vaska", "cat", 3);
        Pet pet1 = new Pet("Petka", "frog", 2);
        Pet pet2 = new Pet("Teddy", "dog", 5);
        human.petAddToHuman(pet);
        human.petAddToHuman(pet1);
        human.petAddToHuman(pet2);

        System.out.println(human);

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Pet.class, new PetSerializer())
                .registerTypeAdapter(Human.class, new HumanSerializer())
                .registerTypeAdapter(Pet.class, new PetDeserializer())
                .registerTypeAdapter(Human.class, new HumanDeserializer())
                .setPrettyPrinting()
                .create();

        String humanJson = gson.toJson(human);
//        String petJson = gson.toJson(pet);

        System.out.println(humanJson);
//        System.out.println(petJson);

        System.out.println();

        Human newHuman = gson.fromJson(humanJson, Human.class);
//        Pet newPet = gson.fromJson(petJson, Pet.class);

//        System.out.println(newPet);
        System.out.println(newHuman);
    }
}
