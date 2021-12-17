import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main(String[] args) {
        PetList petList = new PetList();
        Human human = new Human("Петр", 18, 'м', 67.5, 183.3);
        System.out.println(human);
        Pet pet = new Pet("Барсик", "кошка", 3);
        Pet pet1 = new Pet("Васька", "собака", 5);
        Pet pet2 = new Pet("Саня", "лемур", 2);
        human.addPetToHuman(pet);
        human.addPetToHuman(pet1);
        human.addPetToHuman(pet2);

        petList.addPets(pet);
        petList.addPets(pet1);
        petList.addPets(pet2);

        System.out.println(human);
        System.out.println(pet);
        System.out.println();

        Gson gson = new GsonBuilder().registerTypeAdapter(PetList.class,new PetListSerializer()).registerTypeAdapter(Pet.class, new PetSerializer()).registerTypeAdapter(Human.class, new HumanSerializer()).create();

        String humanJson = gson.toJson(human);
        String petJson = gson.toJson(pet);
        System.out.println(humanJson);
        System.out.println(petJson);
        System.out.println();

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String petListJson = gson2.toJson(petList);
        Gson gson1 = new GsonBuilder().registerTypeAdapter(PetList.class, new PetListSerializer()).registerTypeAdapter(Pet.class, new PetSerializer()).setPrettyPrinting().create();
        String petListJson1 = gson1.toJson(petList);

        System.out.println(petListJson);
        System.out.println(petListJson1);

    }
}
