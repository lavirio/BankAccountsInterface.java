import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Добро пожаловать в самый лучший на планете отель!\n" +
                "Здесь Вы можете выполнять разные действия на разных этажах!\n" +
                "Вы начинаете свое путешествие с регестрации в отеле...");

        Thread.sleep(3500);

        System.out.println("Для регистрации в отеле и начала игры введите свое имя:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Далее укажите свой возраст: ");
        int age = new Scanner(System.in).nextInt();

        Guest human = new Guest(name, age);
        human.getGuestInformation();

        while (true) {
            if (human.getLimit() <= 0) {
                System.out.println("Игра закончилась, вы проиграли все деньги!");
            } else {
                System.out.println("Вам доступен перечень команд:\n" +
                        "1)Укажите номер этажа на который хотите поехать и начать взаимодействовать\n" +
                        "2)Person - информация о пользователе\n" +
                        "3)Info - информация об отеле\n" +
                        "4)Exit - выйти из отеля");

                String action = new Scanner(System.in).nextLine();

                if (action.toLowerCase().startsWith("person")) {
                    human.getGuestInformation();
                } else if (action.toLowerCase().startsWith("exit")) {
                    if (Lift.getFloor() == 0) {
                        System.out.println("Вы вышли из отеля!");
                        return;
                    } else {
                        System.out.println("Вы не можете покинуть отель не покурив чахи с пацанами!");
                    }
                } else if (action.toLowerCase().startsWith("info")) {
                    Lift.hotelInfo();
                } else if (action.startsWith("0")) {
                    Lift.zeroFloor(action);
                } else if (action.startsWith("1")) {
                    Lift.firstFloor(action);
                } else if (action.startsWith("2")) {
                    Lift.secondFloor(action);
                } else if (action.startsWith("3")) {
                    Lift.thirdFloor(action);
                } else if (action.startsWith("4")) {
                    Lift.fourthFloor(action);
                } else if (action.startsWith("5")) {
                    Lift.fifthFloor(action);
                } else {
                    System.out.println("Действие не распознано, повторите ввод!");
                }
            }
        }
    }
}