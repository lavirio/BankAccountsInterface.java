public class Arithmetic {
    int number1;
    int number2;

    public Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void calc(){
        System.out.println("Сумма чисел: " + (number1 + number2));
        System.out.println("Разность чисел: " + (number1 - number2));
        System.out.println("Произведение чисел: " + (number1 * number2));
        System.out.println("Среднее значение этих двух чисел: " + ((number1 + number2) / 2));
        System.out.println("Максимальное значение: " + Math.max(number1,number2));
        System.out.println("Минимальное значение: " + Math.min(number1,number2));
    }
}
