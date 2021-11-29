import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[15];

        System.out.println("Введите число (в диапозоне от 10 до 30):");
        int number = new Scanner(System.in).nextInt();

        int min = 10;
        int max = 30;
        int plus = 0;
        for (int i : array){
            array[i] = (int) (min + Math.random() * ((max - min) + 1));
            if (number == array[i]){
                plus = 1;
            } else {
                plus = -1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println(plus);
    }
}