import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Arithmetic arithmetic = new Arithmetic(scanner(),scanner());
       arithmetic.calc();
    }

    public static int scanner() {
        System.out.println("Введите число:");
        return new Scanner(System.in).nextInt();
    }
}
