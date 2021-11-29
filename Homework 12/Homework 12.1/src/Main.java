import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sumDigits(digits());
    }

    public static void sumDigits(int number) {
        String num = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(sum);
    }

   private static int digits(){
        System.out.println("Введите число:");
        return new Scanner(System.in).nextInt();
    }
}
