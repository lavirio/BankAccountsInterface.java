import java.util.Scanner;

public class Lift {
    private boolean isContinue = true;

    public void chooseFloor(){
        while(isContinue) {
            System.out.println("Нажмите номер этажа на который Вы хотите поехать? (1-5)");
            String floor = new Scanner(System.in).nextLine();
            switch (floor) {
                case "1" -> System.out.println("Вы приехали на этаж № 1");
                case "2" -> System.out.println("Вы приехали на этаж № 2");
                case "3" -> System.out.println("Вы приехали на этаж № 3");
                case "4" -> System.out.println("Вы приехали на этаж № 4");
                case "5" -> System.out.println("Вы приехали на этаж № 5");
                default -> System.out.println("Нет такого этажа!");
            }
            System.out.println("Хотите попробовать снова? (Y/N)");
            Scanner scanner = new Scanner(System.in);
            if(scanner.nextLine().equals("N")) {
                isContinue = false;
            }
        }
    }
}