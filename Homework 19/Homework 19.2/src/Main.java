import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        check(number());
    }

    private static void check(int number) {
        if (number % 2 == 0) {
            System.out.println("Число " + number + " является четным!");
        } else {
            System.out.println("Число " + number + " является не четным!");
        }
    }

    private static int number() {
        System.out.println("Введите число:");
        return new Scanner(System.in).nextInt();
    }
}
