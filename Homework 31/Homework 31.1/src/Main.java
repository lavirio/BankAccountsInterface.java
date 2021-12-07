import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator(sumDigits(), sumDigits());
            calculator.sum();
            calculator.subtraction();
            calculator.multiplication();
            calculator.division();
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
    }

    public static Double sumDigits() throws noneDigitsException {
        String number;
        System.out.println("Введите число:");
        number = new Scanner(System.in).nextLine();
        if (number.matches("\\d+")){
            return Double.parseDouble(number);
        } else {
            throw new noneDigitsException("Заданные значения не являются числами!");
        }
    }
}
