import com.google.gson.*;

import java.lang.reflect.Type;

public class HumanSerializer implements JsonSerializer<Human> {

    @Override
    public JsonElement serialize(Human human, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(human.getName() + " - " + human.getAge() + " - " + human.getGender() + " - " + human.getHeight() + human.getPetLists());
    }
}
