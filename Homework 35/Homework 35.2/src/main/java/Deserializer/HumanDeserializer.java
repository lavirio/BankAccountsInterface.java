package Deserializer;

import Core.Human;
import Core.Pet;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class HumanDeserializer implements JsonDeserializer<Human> {

    @Override
    public Human deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject humanObject = jsonElement.getAsJsonObject();

        Human human = new Human();
        human.setName(humanObject.get("Name").getAsString());
        human.setAge(Integer.parseInt(humanObject.get("Age").getAsString()));
        human.setGender(humanObject.get("Gender").getAsString());
        human.setWeight(Double.parseDouble(humanObject.get("Weight").getAsString()));
        human.setHeight(Double.parseDouble(humanObject.get("Height").getAsString()));

        JsonArray petArray = humanObject.getAsJsonArray("Pets");
        List<Pet> pets = new ArrayList<>();
        petArray.forEach(pet -> pets.add(context.deserialize(pet, Pet.class)));
        human.setPetLists(pets);

        return human;
    }
}
