import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       check(numbers(),numbers());
    }

    private static void check(int number1, int number2) {
        System.out.println("Наименьшее число из " + number1 + " и " + number2 + " - " + Math.min(number1,number2));
    }

    private static int numbers(){
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }
}
