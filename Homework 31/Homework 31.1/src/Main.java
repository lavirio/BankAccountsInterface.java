import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator(Calculator.sumDigits(),Calculator.sumDigits());
            calculator.sum();
            calculator.subtraction();
            calculator.multiplication();
            calculator.division();
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
    }

}
