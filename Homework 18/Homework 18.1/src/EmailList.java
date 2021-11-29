import java.util.ArrayList;

public class EmailList {
    static ArrayList<String> emailList = new ArrayList<>();

    public static void list() {
        if (emailList.isEmpty()) {
            System.out.println("Записаная книга пуста!");
            return;
        }
        for (String s : emailList) {
            System.out.println(s);
        }
    }

    public static void add(String email) {
        if (emailList.contains(email)) {
            System.out.println("email уже существует!");
            return;
        }
        addValidation(email);
    }

    public static void addValidation(String email) {
        if (email.matches("\\w+@\\w+\\.\\w+")) {
            System.out.println("email " + email + " успешно добавлен!");
            emailList.add(email);
        } else {
            System.out.println("Формат ввода не правильный!");
        }
    }
}
