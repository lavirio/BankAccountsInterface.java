import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetList {
    private List<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet){
        pets.add(pet);
    }
}
