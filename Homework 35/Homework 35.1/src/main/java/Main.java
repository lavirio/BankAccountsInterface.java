import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main(String[] args) {
        Human human = new Human("Петр", 18, 'м', 67.5, 183.3);

        Pet pet = new Pet("Барсик", "кошка", 3);
        Pet pet1 = new Pet("Васька", "собака", 5);
        Pet pet2 = new Pet("Саня", "лемур", 2);
        human.addPetToHuman(pet);
        human.addPetToHuman(pet1);
        human.addPetToHuman(pet2);


        System.out.println(human);
        System.out.println();

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Pet.class, new PetSerializer())
                .registerTypeAdapter(Human.class, new HumanSerializer())
                .setPrettyPrinting()
                .create();

        String humanJson = gson.toJson(human);
        System.out.println(humanJson);
        System.out.println();



    }
}
