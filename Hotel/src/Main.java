import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите имя постояльца: ");
        String name = new Scanner(System.in).nextLine();

        System.out.print("Введите возраст постояльца: ");
        int age = new Scanner(System.in).nextInt();

        Guest number1 = new Guest(name, age);
        number1.guestInformation();

        Hotel hotel = new Hotel();
        hotel.info(number1);
        hotel.goUp(number1);
        hotel.goDown(number1);
        hotel.goOut(number1);
    }
}