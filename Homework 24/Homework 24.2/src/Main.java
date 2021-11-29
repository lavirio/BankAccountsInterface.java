import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите имя, номер или команду: ");
            String action = new Scanner(System.in).nextLine();

            if (action.toLowerCase().startsWith("clear")) {
                PhoneBook.clear();
            } else if (action.toLowerCase().startsWith("list")) {
                PhoneBook.list();
            } else if (action.toLowerCase().startsWith("exit")) {
                System.out.println("Вы вышли из программы!");
                return;
            } else if (action.matches("[A-я]+")) {
                PhoneBook.addByName(action);
            } else if (action.matches("\\d+")) {
                PhoneBook.addByNumber(action);
            } else {
                System.out.println("Действие нераспознано!");
            }
        }
    }
}