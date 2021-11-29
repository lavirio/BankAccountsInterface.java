import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        System.out.println("Введите третье число:");
        int thirdNumber = new Scanner(System.in).nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Минимальный возраст: " + firstNumber);
            System.out.println("Средний возраст: " + secondNumber);
            System.out.println("Максимальный возраст: " + thirdNumber);
        } else if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("Минимальный возраст: " + firstNumber);
            System.out.println("Средний возраст: " + thirdNumber);
            System.out.println("Максимальный возраст: " + secondNumber);
        } else if (secondNumber < firstNumber && firstNumber < thirdNumber) {
            System.out.println("Минимальный возраст: " + secondNumber);
            System.out.println("Средний возраст: " + firstNumber);
            System.out.println("Максимльный возраст: " + thirdNumber);
        } else if (secondNumber < thirdNumber && thirdNumber < firstNumber) {
            System.out.println("Минимальный возраст: " + secondNumber);
            System.out.println("Средний возраст: " + thirdNumber);
            System.out.println("Максимальный возраст: " + firstNumber);
        } else if (thirdNumber < secondNumber && secondNumber < firstNumber) {
            System.out.println("Минимальный возраст: " + thirdNumber);
            System.out.println("Средний возраст: " + secondNumber);
            System.out.println("Максимальный возраст: " + firstNumber);
        } else if (thirdNumber < firstNumber && firstNumber < secondNumber) {
            System.out.println("Минимальный возраст: " + thirdNumber);
            System.out.println("Средний возраст: " + firstNumber);
            System.out.println("Максимальный возраст: " + thirdNumber);
        }
    }
}