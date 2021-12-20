package Serializer;

import Core.Human;

import Core.Pet;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.List;

public class HumanSerializer implements JsonSerializer<Human> {
    @Override
    public JsonElement serialize(Human human, Type type, JsonSerializationContext contex) {
        JsonObject object = new JsonObject();
        object.addProperty("Name", human.getName());
        object.addProperty("Age", human.getAge());
        object.addProperty("Gender", human.getGender());
        object.addProperty("Weight", human.getWeight());
        object.addProperty("Height", human.getHeight());

        JsonArray petArray = new JsonArray();
        List<Pet> pets = human.getPetLists();
        pets.forEach(pet -> petArray.add(contex.serialize(pet)));

        object.add("Pets", petArray);

        return object;
    }
}
