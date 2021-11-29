import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число, которое хотите возвести в степень:");
        int number =new Scanner(System.in).nextInt();

        System.out.println("Введите степень в которую хотите возвести число:");
        int pow = new Scanner(System.in).nextInt();

        int [] array = new int[pow+1];

        int sum = 0;
        for (int i = 1; i < array.length; i++){
            array[i] = (int) Math.pow(number,i);
            sum += array[i];
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println("Сумма всех значений: " + sum);
    }
}