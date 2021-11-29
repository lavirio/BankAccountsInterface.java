import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона:");
        String number = new Scanner(System.in).nextLine();

        if (number.matches("7[0-9]{10}")){
            System.out.println("+".concat(number));
        } else if (number.matches("8[0-9]{10}")){
            System.out.println(number.replaceAll("^8","+7"));
        } else if (number.matches("[0-9]{10}")){
            System.out.println("+7".concat(number));
        } else {
            System.out.println("Неправильный формат ввода!");
        }
    }
}
