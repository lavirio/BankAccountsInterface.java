import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в симулятор записной книжки.\n" +
                "Здесь можно выполнять разные действия, а именно:\n" +
                "1)Добавлять новые контакты\n" +
                "2)Поиск контактной информации по имени\n" +
                "3)Поиск контакт информации по номеру телефона\n" +
                "4)Clear - очистить записную книжку\n" +
                "5)List - распечатать все контакты из записной книжки\n" +
                "6)Info - посмотреть доступные команды\n" +
                "7)Exit - выход из программы");

        while (true) {
            System.out.println("Введите номер, имя или команду:");
            String action = new Scanner(System.in).nextLine();

            if (action.toLowerCase().startsWith("clear")) {
                PhoneBook.clearAllContacts();
            } else if (action.toLowerCase().startsWith("list")) {
                PhoneBook.printAllContacts();
            } else if (action.toLowerCase().startsWith("info")) {
                PhoneBook.directoryInfo();
            } else if (action.toLowerCase().startsWith("exit")) {
                System.out.println("Вы вышли из программы!");
                return;
            } else if (action.toLowerCase().matches("^\\d+")) {
                PhoneBook.searchContactsByNumberConditions(action);
            } else if (action.toLowerCase().matches("[A-я]+")) {
                PhoneBook.searchContactsByNameConditions(action);
            } else {
                System.out.println("Команда не распознана, повторите ввод!");
            }
        }
    }
}