package Deserializer;

import Core.Pet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class PetDeserializer implements JsonDeserializer<Pet> {
    @Override
    public Pet deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        Pet pet = new Pet();
        String petString = jsonElement.getAsString();

        String petName = petString.replaceAll("(\\w+.-.)(\\w+.-.)(\\d)","$1").replaceAll(".-.","").trim();
        String petType = petString.replaceAll("(\\w+.-.)(\\w+.-.)(\\d)","$2").replaceAll(".-.","").trim();
        int petAge = Integer.parseInt(petString.replaceAll("(\\w+.-.)(\\w+.-.)(\\d)","$3"));

        pet.setName(petName);
        pet.setType(petType);
        pet.setAge(petAge);
        return pet;
    }
}
