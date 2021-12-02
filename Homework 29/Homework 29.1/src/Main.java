import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static List<Employee> employees = getPeopleListFromFile();
    private static final long MILLISPERDAY = 86400000;
    public static void main(String[] args) {

        System.out.println("Список сотрудников:");
        employees.forEach(System.out::println);
        System.out.println("\n");

        long salarySum = employees.stream().mapToLong(Employee::getSalary).sum();
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        System.out.println("Сумма заработной платы всех сотрудников: " + decimalFormat.format(salarySum) + " рублей");
        Employee employee = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Карточка сотрудника с самой высокой зарабатной платой: " + employee);

        System.out.println("\n");
        findEmployeeWithHighestSalary();
    }

    private static void findEmployeeWithHighestSalary() {
        System.out.println("Введите дату первого рабочего дня сотрудника:");
        String startWorkDate = new Scanner(System.in).nextLine();
        System.out.println("Введите дату последнего рабочего дня сотрудника:");
        String finishWorkDate = new Scanner(System.in).nextLine();
        try {
            Date startDateFormat = new SimpleDateFormat("dd.MM.yyyy").parse(startWorkDate);
            Date startDate = new Date(startDateFormat.getTime() - MILLISPERDAY);
            Date finishDateFormat = new SimpleDateFormat("dd.MM.yyyy").parse(finishWorkDate);
            Date finishDate = new Date(finishDateFormat.getTime() + MILLISPERDAY);
            System.out.println();
            System.out.println("Карточки сотрудников в выбранном диапозоне:");
            employees.stream().filter(employee1 -> employee1.getStartWorkDate().after(startDate)).filter(employee1 -> employee1.getStartWorkDate().before(finishDate)).forEach(System.out::println);
            System.out.println("\n");
            Employee employeeWithMaxSalary = employees.stream().filter(employee1 -> employee1.getStartWorkDate().after(startDate)).filter(employee1 -> employee1.getStartWorkDate().before(finishDate)).max(Comparator.comparing(Employee::getSalary)).get();
            System.out.println("Карточка сотрудника с максимальной зарабатной платой в выбранном диапозоне: " + employeeWithMaxSalary);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static List<Employee> getPeopleListFromFile() {
        List<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get("data/staff.txt"));
            for (String line : lines) {
                String[] fragments = line.split("\\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong!");
                    continue;
                }
                staff.add(new Employee(fragments[0], Integer.parseInt(fragments[1]), new SimpleDateFormat("dd.MM.yyyy").parse(fragments[2])));
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return staff;
    }
}