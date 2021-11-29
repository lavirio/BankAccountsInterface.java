import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate presentDay = LocalDate.now();
        LocalDate birthdayDay = LocalDate.of(1997,2,4);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EE");

            while (birthdayDay.isBefore(presentDay)) {
                System.out.println(birthdayDay.format(dateTimeFormatter));
                birthdayDay = birthdayDay.plusYears(1);
            }
        }
    }
