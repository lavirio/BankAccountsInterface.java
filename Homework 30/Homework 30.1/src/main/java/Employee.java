import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String name;
    private String surname;
    private Integer age;
    private Date startWorkingDate;
    private String phoneNumber;

}
