import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calc(getInt(), getInt(), getOperation());
    }

    private static int getInt() {
        System.out.println("Введите число:");
        return new Scanner(System.in).nextInt();
    }

    private static char getOperation() {
        System.out.println("Введите знак операции:");
        return new Scanner(System.in).nextLine().charAt(0);
    }

    private static void calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> System.out.println(num1 / num2);
            default -> System.out.println("Дейтсвие не распознано!");
        }
    }
}
