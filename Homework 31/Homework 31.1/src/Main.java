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

    public static Double sumDigits() {
        System.out.println("Введите число:");
        return new Scanner(System.in).nextDouble();
    }
}
