import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите дело:");
            String command = new Scanner(System.in).nextLine();

            if (command.toLowerCase().startsWith("list")) {
                List.list();
            } else if (command.matches("[ad]+\\s+\\d+.+")) {
                String info = command.split("\\s+", 2)[1].trim();
                int index = Integer.parseInt(info.split("\\s+",2)[0].trim());
                String action = info.split("\\s+",2)[1].trim();
                List.add(action, index);
            } else if (command.toLowerCase().startsWith("add")) {
                String action = command.split("\\s+", 2)[1].trim();
                List.add(action);
            } else if (command.toLowerCase().startsWith("delete")) {
                int index = Integer.parseInt(command.split("\\s+")[1].trim());
                List.delete(index);
            } else if (command.toLowerCase().startsWith("edit")) {
                String info = command.split("\\s+", 2)[1].trim();
                int index = Integer.parseInt(info.split("\\s+",2)[0].trim());
                String newAction = info.split("\\s+",2)[1].trim();
                List.edit(index, newAction);
            } else if (command.toLowerCase().startsWith("exit")) {
                return;
            } else {
                System.out.println("Команда не распознана, повторите ввод!");
            }
        }
    }
}