import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        check(number());
    }

    private static void check(int number) {
        System.out.println("Введите число границы:");
        int border = new Scanner(System.in).nextInt();
        if (number > border) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static int number() {
        System.out.println("Введите число:");
        return new Scanner(System.in).nextInt();
    }
}