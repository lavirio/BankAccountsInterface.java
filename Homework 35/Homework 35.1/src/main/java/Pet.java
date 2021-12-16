import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    @SerializedName("petName")
    private String name;
    @SerializedName("petType")
    private String type;
    @SerializedName("petAge")
    private int age;

}
