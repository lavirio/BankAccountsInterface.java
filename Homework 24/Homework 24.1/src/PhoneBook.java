import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    private static final Map<String, String> phoneBook = new TreeMap<>();

    public static void clearAllContacts() {
        if (phoneBook.isEmpty()) {
            System.out.println("Невозможно выполнить действие так как записная книга пуста!");
            return;
        }
        phoneBook.clear();
        System.out.println("Все контакты успешно удалены!");
    }

    public static void searchContactsByNameConditions(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Контакт " + name + " с номером телефона " + phoneBook.get(name));
        } else {
            System.out.println("Контакта с таким именем нет в записной книжке, чтобы его добавть введите номер телефона:");
            searchContactsByName(name);
        }
    }

    private static void searchContactsByName(String name) {
        String number = new Scanner(System.in).nextLine();
        if (number.matches("(7)[0-9]{10}")) {
            String matchNumber = number.replaceAll("^7", "+7");
            searchByNameConditions(name, matchNumber);
        } else if (number.matches("(8)[0-9]{10}")) {
            String matchNumber = number.replaceAll("^8", "+7");
            searchByNameConditions(name, matchNumber);
        } else if (number.matches("[0-9]{10}")) {
            String matchNumber = "+7".concat(number);
            searchByNameConditions(name, matchNumber);
        } else {
            System.out.println("Номер неправильного формата, повторите ввод: ");
            searchContactsByName(name);
        }
    }

    private static void searchByNameConditions(String name, String matchNumber) {
        if (phoneBook.containsValue(matchNumber)) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (entry.getValue().equals(matchNumber)) {
                    System.out.println("Невозможно создать контакт так как номер используется в контакте " + entry.getKey());
                }
            }
        } else {
            phoneBook.put(name, matchNumber);
            System.out.println("Контакт " + name + " с номером телефона " + phoneBook.get(name) + " успешно добавлен!");
        }
    }

    public static void searchContactsByNumberConditions(String number) {
        if (number.matches("(7)[0-9]{10}")) {
            String matchNumber = number.replaceAll("^7", "+7");
            searchContactsByNumber(matchNumber);
        } else if (number.matches("(8)[0-9]{10}")) {
            String matchNumber = number.replaceAll("^8", "+7");
            searchContactsByNumber(matchNumber);
        } else if (number.matches("[0-9]{10}")) {
            String matchNumber = "+7".concat(number);
            searchContactsByNumber(matchNumber);
        } else {
            System.out.println("Вы ввели номер неправльного формата!");
        }
    }

    private static void searchContactsByNumber(String number) {
        if (phoneBook.containsValue(number)) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (entry.getValue().equals(number)) {
                    System.out.println("Контакт " + entry.getKey() + " с номером телефона " + entry.getValue());
                }
            }
        } else {
            System.out.println("Контакта с таким номером нет в записной книжке, чтобы его добавить введите имя:");
            searchByNumberNameConditions(number);
        }
    }

    private static void searchByNumberNameConditions(String number) {
        String name = new Scanner(System.in).nextLine();
        if (name.matches("[A-я]+")) {
            phoneBook.put(name, number);
            System.out.println("Контакт " + name + " с номером телефона " + phoneBook.get(name) + " успешно добавлен!");
        } else {
            System.out.println("Данное имя не может быть сохранено, повторите ввод:");
            searchByNumberNameConditions(number);
        }
    }

    public static void printAllContacts() {
        if (phoneBook.isEmpty()) {
            System.out.println("Записная книга пуста!");
            return;
        }
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void directoryInfo() {
        System.out.println("1)Добавлять новые контакты\n" +
                "2)Поиск контактной информации по имени\n" +
                "3)Поиск контакт информации по номеру телефона\n" +
                "4)Clear - очистить записную книжку\n" +
                "5)List - распечатать все контакты из записной книжки\n" +
                "6)Info - посмотреть доступные команды\n" +
                "7)Exit - выход из программы");
    }
}