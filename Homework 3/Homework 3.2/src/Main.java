import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите число №1:");
        double firstNumber = new Scanner(System.in).nextDouble();

        System.out.print("Введите число №2:");
        double secondNumber = new Scanner(System.in).nextDouble();

        System.out.print("Введите знак операции:");
        String symbol = new Scanner(System.in).nextLine();

        switch (symbol) {
            case "+" -> System.out.println(firstNumber + secondNumber);
            case "-" -> System.out.println(firstNumber - secondNumber);
            case "/" -> System.out.println(firstNumber / secondNumber);
            case "*" -> System.out.println(firstNumber * secondNumber);
            default -> System.out.println("Знак действия не распознан!");
        }
    }
}
