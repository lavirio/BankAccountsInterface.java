import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static final Map<String, Contact> phoneBook = new TreeMap<>();
    static Contact contact = new Contact("не указана", "не указано", "не указан", "не указан", "не указан", "не указан");

    public static void addByName(String name) {
        if (!phoneBook.containsKey(name)) {
            System.out.println("Абоненанта с таким именем не существует в записаной книге!");
            System.out.println("Чтобы его сохранить, введите его номер: ");
            String number = new Scanner(System.in).nextLine();
            phoneBook.put(name, new Contact(contact.getSurname(), contact.getPatronymic(), number, contact.getHomeNumber(), contact.getAddress(), contact.getEmail()));
            System.out.println("Абонент с именем " + name + " и телефонным номером " + number + " успешно сохранен в памяти!");
        } else {
            for (Map.Entry<String, Contact> entry : phoneBook.entrySet()) {
                if (entry.getKey().contains(name)) {
                    System.out.println("Контакт: Имя " + entry.getKey() + "" + entry.getValue());
                }
            }
            System.out.println("Если хотите внести изминения, то укажите необходимый раздел, удлите контакт или выйдете в главное меню:");
            addByNameNextSteps(name);
        }
    }

    public static void addByNameNextSteps(String name) {
        String action = new Scanner(System.in).nextLine();
        if (action.toLowerCase().startsWith("фамилия")) {
            System.out.println("Введите фамилию: ");
            addByNameSurnameValidation(name);
        } else if (action.toLowerCase().startsWith("отчество")) {
            System.out.println("Введите отчество: ");
            addByNamePatronymicValidation(name);
        } else if (action.toLowerCase().startsWith("мобильный")) {
            System.out.println("Введите номер: ");
            addByNameMobileValidation(name);
        } else if (action.toLowerCase().startsWith("домашний")) {
            System.out.println("Введите номер: ");
            addByNamePhoneValidation(name);
        } else if (action.toLowerCase().startsWith("адрес")) {
            System.out.println("Введите адрес: ");
            addByNameAddressValidation(name);
        } else if (action.toLowerCase().startsWith("почта")) {
            System.out.println("Введите email: ");
            addByNameMailValidation(name);
        } else if (action.toLowerCase().startsWith("exit")) {
            System.out.println("Вы вышли в главное меню!");
        } else if (action.toLowerCase().startsWith("delete")) {
            phoneBook.remove(name);
            System.out.println("Контакт " + name + " успешно удален!");
        } else {
            System.out.println("Действие не распознано!");
            System.out.println("Повторите ввод:");
            addByNameNextSteps(name);
        }
    }

    public static void addByNameSurnameValidation(String name) {
        String surname = new Scanner(System.in).nextLine();
        if (surname.matches("[А-я]+")) {
            phoneBook.get(name).setSurname(surname);
            System.out.println("Фамилия успешно добавлена!");
        } else {
            System.out.println("Введеный текст не соответсвует формату, повторите ввод:");
            addByNameSurnameValidation(name);
        }
    }

    public static void addByNamePatronymicValidation(String name) {
        String patronymic = new Scanner(System.in).nextLine();
        if (patronymic.matches("[А-я]+")) {
            phoneBook.get(name).setPatronymic(patronymic);
            System.out.println("Отчетсво успешно добавлено!");
        } else {
            System.out.println("Введеный текст не соответсвует формату, повторите ввод:");
            addByNamePatronymicValidation(name);
        }
    }

    public static void addByNameMobileValidation(String name) {
        String number = new Scanner(System.in).nextLine();
        if (number.matches(""))
            phoneBook.get(name).setMobileNumber(number);
        System.out.println("Номер успешно изменен!");
    }

    public static void addByNamePhoneValidation(String name) {
        String number = new Scanner(System.in).nextLine();
        if (number.matches(""))
            phoneBook.get(name).setHomeNumber(number);
        System.out.println("Номер успешно изменен!");
    }

    public static void addByNameAddressValidation(String name) {
        String address = new Scanner(System.in).nextLine();
        phoneBook.get(name).setAddress(address);
        System.out.println("Адрес успешно добавлен");
    }

    public static void addByNameMailValidation(String name) {
        String mail = new Scanner(System.in).nextLine();
        if (mail.matches("\\S+@[A-z]+.[A-z]+")) {
            phoneBook.get(name).setEmail(mail);
            System.out.println("Email успешно добавлен!");
        } else {
            System.out.println("Введеный текст не соответсвует формату, повторите ввод:");
            addByNameMailValidation(name);
        }
    }

    public static void list() {
        if (phoneBook.isEmpty()) {
            System.out.println("Телефонная книга пуста!");
        } else
            for (Map.Entry<String, Contact> entry : phoneBook.entrySet()) {
                System.out.println("Контакт: Имя " + entry.getKey() + "" + entry.getValue());
            }
    }

    public static void clear() {
        if (phoneBook.isEmpty()) {
            System.out.println("Невозможно выполнить действие так как телефонная книга пуста!");
        } else {
            phoneBook.clear();
        }
    }

    public static void size() {
        if (phoneBook.isEmpty()) {
            System.out.println("Телефонная книга пуста!");
        } else {
            phoneBook.size();
        }
    }
}