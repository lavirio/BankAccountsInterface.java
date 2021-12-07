import java.util.Scanner;

public class Calculator {
    private Double number1;
    private Double number2;

    public Calculator(Double number1, Double number2) throws Exception {

        if (number1 < 0 && number2 < 0) {
            throw new negativeDigitsException("Заданные значения меньше нуля!");
        } else if (number1.equals(number2)) {
            throw new sameDigitsException("Заданные значения одинаковы!");
        } else {
            this.number1 = number1;
            this.number2 = number2;
        }
    }

    public static Double sumDigits() throws noneDigitsException {
        String number;
        System.out.println("Введите число:");
        number = new Scanner(System.in).nextLine();
        if (number.matches("-?\\d+")){
            return Double.parseDouble(number);
        } else {
            throw new noneDigitsException("Заданное значение не являются числом!");
        }
    }

    public Double getNumber1() {
        return number1;
    }

    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2(Double number2) {
        this.number2 = number2;
    }


    public void sum() {
        System.out.println("Сумма: " + (number1 + number2));
    }

    public void subtraction() {
        System.out.println("Разность: " + (number1 - number2));
    }

    public void multiplication() {
        System.out.println("Произведение: " + number1 * number2);
    }

    public void division() {
        System.out.println("Деление: " + number1 / number2);
    }
}
