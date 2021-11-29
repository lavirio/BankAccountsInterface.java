import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String name;
    private Integer salary;
    private Date startWorkDate;

    public Employee(String name, Integer salary, Date startWorkDate) {
        this.name = name;
        this.salary = salary;
        this.startWorkDate = startWorkDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(Date startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    @Override
    public String toString() {
        return name + "\t" + salary + "\t" + new SimpleDateFormat("dd.MM.yyyy").format(startWorkDate);
    }
}
