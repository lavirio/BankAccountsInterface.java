import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите действие:\n" +
                    "1)Add - добавить\n" +
                    "2)List - список email\n" +
                    "3)Exit - выход");
            String action = new Scanner(System.in).nextLine();

            if (action.toLowerCase().startsWith("add")) {
                String email = action.split("\\s+")[1].trim();
                EmailList.add(email);
            } else if (action.toLowerCase().startsWith("list")) {
                EmailList.list();
            } else if (action.toLowerCase().startsWith("exit")) {
                return;
            } else {
                System.out.println("Действие не распознано, повторите ввод:");
            }
        }
    }
}