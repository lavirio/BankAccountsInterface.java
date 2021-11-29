import java.util.*;

public class PhoneBook {
    private static final Map<String, Set<String>> PHONEBOOK = new TreeMap<>();

    public static void clear() {
        if (PHONEBOOK.isEmpty()) {
            System.out.println("Невозможно выполнить действие так как записаная книга пуста!");
            return;
        }
        PHONEBOOK.clear();
        System.out.println("Контакты успешно удалены!");
    }

    public static void list() {
        if (PHONEBOOK.isEmpty()) {
            System.out.println("Записная книга пуста!");
            return;
        }
        for (Map.Entry<String, Set<String>> entry : PHONEBOOK.entrySet()) {
            System.out.println(entry.getKey());
            for (String num : entry.getValue()) {
                System.out.println(num);
            }
        }
    }

    public static void addByName(String name) {

        if (!PHONEBOOK.containsKey(name)) {
            Set<String> numbers = new HashSet<>();
            System.out.println("Введите номер для абонента " + name + ", чтобы добавить ему номер!");

            String mobileNumber = new Scanner(System.in).nextLine();
            numbers.add(mobileNumber);
            PHONEBOOK.put(name, numbers);

            System.out.println("К абоненту " + name + " успешно добавлен номер!");
        } else {
            Set<String> numbers = PHONEBOOK.get(name);
            System.out.println("Введите новый номер абонента " + name + ":");

            String mobileNumber = new Scanner(System.in).nextLine();
            numbers.add(mobileNumber);
            PHONEBOOK.put(name, numbers);

            System.out.println("Новый номер для абонента " + name + " успешно добавлен");
        }
    }

    public static void addByNumber(String number) {
        boolean isContinue = false;
        for (Map.Entry<String, Set<String>> entry : PHONEBOOK.entrySet()) {
            if(entry.getValue().contains(number)) {
                isContinue = true;
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        if(!isContinue) {
            System.out.println("Введите имя");
            String name = new Scanner(System.in).nextLine();
            if (!PHONEBOOK.containsKey(name)) {
                Set<String> numbers = new HashSet<>();
                numbers.add(number);
                PHONEBOOK.put(name, numbers);
            }
            else {
                PHONEBOOK.get(name).add(number);
            }
        }
    }
}