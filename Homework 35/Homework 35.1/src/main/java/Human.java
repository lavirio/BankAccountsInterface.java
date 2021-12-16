import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Human {
    private String name;
    private int age;
    private char gender;
   transient private double weight;
    private double height;

}
