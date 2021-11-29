import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        check(number());
    }

    private static void check(int number) {
        DecimalFormat decimalFormat = new DecimalFormat("##");
        double a = Math.pow(number,2);
        System.out.println("Квадрт числа " + number + " равен " + decimalFormat.format(a) );
    }

    private static int number(){
        System.out.println("Введите число:");
        return new Scanner(System.in).nextInt();
    }
}
