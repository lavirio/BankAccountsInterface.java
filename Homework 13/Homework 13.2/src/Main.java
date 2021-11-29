import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ФИО");
        String fio = new Scanner(System.in).nextLine();

        if (fio.matches("((([А-я]+-)?){1,999})[А-я]+\\s+((([А-я]+-)?){1,999})[А-я]+\\s+((([А-я]+-)?){1,999})[А-я]+")) {

            System.out.println("Имя: " + fio.split("\\s+", 3)[1]);
            System.out.println("Фамилия: " + fio.split("\\s+", 3)[0]);
            System.out.println("Отчество: " + fio.split("\\s+", 3)[2]);
        } else {
            System.out.println("ФИО не соответсвует формату!");
        }
    }
}