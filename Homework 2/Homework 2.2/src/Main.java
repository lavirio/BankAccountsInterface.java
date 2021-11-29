import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите температуру в градусах по цельсию: ");
        double c = new Scanner(System.in).nextDouble();

        System.out.println(c * 1.8 + 32 + " градусов цельсия");
    }
}
