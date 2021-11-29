import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите команду, имя или номер:");
            String action = new Scanner(System.in).nextLine();

            if (action.toLowerCase().matches("[А-я]+")) {
                PhoneBook.addByName(action);
            } else if (action.toLowerCase().startsWith("list")) {
                PhoneBook.list();
            } else if (action.toLowerCase().startsWith("exit")) {
                return;
            }  else if (action.toLowerCase().startsWith("clear")){
                PhoneBook.clear();
            } else if (action.toLowerCase().startsWith("size")){
                PhoneBook.size();
            }else {
                System.out.println("Команда не распознана, повторите ввод: ");
            }
        }
    }
}