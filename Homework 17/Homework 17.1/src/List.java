import java.util.ArrayList;

public class List {
    private static final ArrayList<String> LIST = new ArrayList<>();

    public static void list() {
        if (LIST.isEmpty()) {
            System.out.println("Записная книга пуста!");
            return;
        }
        for (int i = 0; i < LIST.size(); i++) {
            System.out.println(i + " - " + LIST.get(i));
        }
    }

    public static void add(String action) {
        if (LIST.contains(action)) {
            System.out.println("Дело уже существует!");
            return;
        }
        System.out.println("Дело " + action + " успешно добавлено!");
        LIST.add(action);
    }

    public static void add(String action, int number) {
        if (LIST.contains(action)) {
            System.out.println("Дело уже существует!");
            return;
        }
        System.out.println("Дело " + action + " на место " + number + " успешно добавлено!");
        LIST.add(number, action);
    }

    public static void delete(int index) {
        if (LIST.size() <= index) {
            System.out.println("Элеменет под индексом " + index + " нет!");
            return;
        }
        System.out.println("Дело " + LIST.get(index) + " успешно удалено!");
        LIST.remove(index);
    }

    public static void edit(int index, String newAction) {
        if (LIST.size() <= index) {
            System.out.println("Элеменет под индексом " + index + " нет!");
            return;
        }
        System.out.println("Дело " + LIST.get(index) + " замено делом " + newAction);
        LIST.set(index, newAction);
    }

}
