import com.google.gson.*;

import java.lang.reflect.Type;

public class PetListSerializer implements JsonSerializer<PetList> {
    @Override
    public JsonElement serialize(PetList petList, Type type, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        object.add("Animals",context.serialize(petList.getPets()));
        return object;
    }
}
