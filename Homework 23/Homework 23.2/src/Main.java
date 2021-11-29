public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(ArithmeticCalculator.getNumber(), ArithmeticCalculator.getNumber());
        ArithmeticCalculator.calculate(arithmeticCalculator.getSymbol());
    }


}
