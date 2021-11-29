import java.util.Scanner;

public class ArithmeticCalculator {
    private static int number1;
    private static int number2;

    public ArithmeticCalculator(int number1, int number2) {
        ArithmeticCalculator.number1 = number1;
        ArithmeticCalculator.number2 = number2;
    }

    public static int getNumber() {
        System.out.println("Введите число:");
        return new Scanner(System.in).nextInt();
    }

    public static void calculate(Operation symbol) {
        if (symbol == Operation.ADD) {
            System.out.println(number1 + number2);
        } else if (symbol == Operation.SUBTRACT) {
            System.out.println(number1 - number2);
        } else if (symbol == Operation.MULTIPLY) {
            System.out.println(number1 * number2);
        } else {
            System.out.println("Операция не распознана!");
        }
    }

    public Operation getSymbol() {
        System.out.println("Напишите название операции на английском:");
        String name = new Scanner(System.in).nextLine();
        return Operation.valueOf(name);
    }
}
