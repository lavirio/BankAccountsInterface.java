import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Human {
    private String name;
    private int age;
    private char gender;
    private double weight;
    private double height;
    private List<PetList> petLists = new ArrayList<>();
}
