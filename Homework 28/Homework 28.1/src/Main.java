import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = getEmployeesListFromFile();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\n\n");

        Collections.sort(employees, (o1, o2) -> {
            if (o1.getSalary().compareTo(o2.getSalary()) == 0) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static List<Employee> getEmployeesListFromFile() {
        List<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get("data/staff.txt"));
            for (String line : lines) {
                String[] fragments = line.split("\\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line!");
                    continue;
                }
                staff.add(new Employee(fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat("dd.MM.yyyy")).parse(fragments[2])));
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return staff;
    }
}
