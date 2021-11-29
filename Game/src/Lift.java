import java.util.InputMismatchException;
import java.util.Scanner;

public class Lift {
    private static int floor;

    public static int getFloor() {
        return floor;
    }

    static Guest guest = new Guest();

    public static void zeroFloor(String action) throws InterruptedException {
        floor = 0;
        Thread.sleep(1000);
        System.out.println("О, братишка я кости рядом кину...");
        Thread.sleep(2500);
        System.out.println("Брат, от души, чаха на грэйпе моя любимая...");
        Thread.sleep(3500);
        System.out.println("Ну ты внатуре вацок, проиграть 3 партии в очко может только Фисик...");
        System.out.println(guest.getLimit() + "$");
    }

    public static void firstFloor(String action) throws InterruptedException {
        int bet = 1;
        floor = 1;
        if (guest.getLimit() < bet) {
            System.out.println("У вас недостаточно денег, чтобы играть в казино!");
            return;
        } else {
            System.out.println("Вы оказались на этаже № " + floor + " и решили сыграть в казино, сделайте вашу ставку (мин 1$): ");
            try {
                bet = new Scanner(System.in).nextInt();
                if (bet < 1) {
                    System.out.println("Минимальная ставка  - 1$");
                    firstFloor(action);
                    return;
                } else {
                }
            } catch (InputMismatchException myExc) {
                System.out.println("Введите целое число!");
                firstFloor(action);
                return;
            }
            System.out.println("Ваша ставка составляет " + bet + "$");
            double fortune = (Math.random());
            System.out.println("Подождите немного пока идет розыгрыш...");
            Thread.sleep(3000);
            if (fortune > 0.5) {
                guest.setLimit(guest.getLimit() + 2 * bet);
                System.out.println("Ваш выигрыш составил " + 2 * bet + "$");
                System.out.println("Ваш баланс: " + guest.getLimit() + "$");
            } else {
                System.out.println("Вы ничего не выиграли!");
                guest.setLimit(guest.getLimit() - bet);
                System.out.println("Ваш баланс: " + guest.getLimit() + "$");
            }
        }
    }

    public static void secondFloor(String action) throws InterruptedException {
        floor = 2;
        System.out.println("Вы оказались на этаже № " + floor + " и без каких либо сил рухнули на кровать и заснули сном младенца...");
        System.out.println("Подождите немного пока вы выспитесь...");
        Thread.sleep(6000);
        System.out.println("Вы полны сил и готовы к новым свершениям!");
    }

    public static void thirdFloor(String action) throws InterruptedException {
        int disease = 50;
        int price = 10;
        int min = 10;
        floor = 3;
        if (guest.getLimit() < min) {
            System.out.println("У вас недостаточно денег, чтобы воспользоваться данными услугами");
            return;
        } else {
            double fortune = Math.random();
            System.out.println("Вы оказались на этаже №" + floor + " и попопали в царство любви");
            Thread.sleep(2000);
            System.out.println("О, да, крошка, двигай бедрами...");
            Thread.sleep(1500);
            System.out.println("Давай, девочка, сделай приятно папочке...");
            Thread.sleep(1500);
            System.out.println("Ты лучшая шлюшка в этом районе...");
            Thread.sleep(3000);
            System.out.println(guest.getGuestName() + ", вы были на высоте сегодня");
            if (fortune > 0.5) {
                guest.setLimit(guest.getLimit() - price);
                System.out.println("Ваш баланс: " + guest.getLimit() + "$");
            } else {
                guest.setDecease(guest.getDecease() + 1);
                System.out.println("К сожалению, в этот раз не повезло, проститутка заразила вас гонореей и залетела." +
                        " На оборот ваш пришлось потратить 50$");
                guest.setLimit(guest.getLimit() - disease);
                System.out.println("Ваш баланс: " + guest.getLimit() + "$");
            }
        }
    }

    public static void fourthFloor(String action) throws InterruptedException {
        floor = 4;
        int price = 15;
        if (guest.getLimit() < price) {
            System.out.println("У вас недостаточно денег, чтобы воспользоваться данными услугами");
            return;
        } else {
            System.out.println("Вы оказались на этаже № " + floor + ", ожидайте, доктор скоро вас примет");
            Thread.sleep(2500);
            if (guest.getDecease() == 0) {
                System.out.println("Вы совершенно здоровы, бухайте и кайфуйте дальше!");
                return;
            } else {
                System.out.println("О, господи, у вас страшная зараза, которую надо срочно вылечить, иначе будет много жертв!");
                guest.setDecease(guest.getDecease() - 1);
                guest.setLimit(guest.getLimit() - 15);
                System.out.println("Ваш баланс: " + guest.getLimit() + "$");
            }
        }
    }

    public static void fifthFloor(String action) throws InterruptedException {
        floor = 5;
        System.out.println("Вы оказались на этаже № " + floor + ", сегодня здесь есть очень много горячих девочек!");
        double fortune1 = Math.random();
        Thread.sleep(3500);
        if (fortune1 > 0.7) {
            System.out.println("Вам удалось склеить сочную телочку, она готова ко всему сегодня ночью!");
            double fortune2 = Math.random();
            Thread.sleep(4000);
            if (fortune2 > 0.5) {
                guest.setLimit(guest.getLimit() - 5);
                System.out.println("Вам удалось изучить с ней всю камасутру!");
                System.out.println("Ваш баланс: " + guest.getLimit() + "$");
            } else {
                guest.setLimit(guest.getLimit() - 5);
                System.out.println("Ваша сосиска дала сбой, но не расстраивайтесь, вы, молоды душой!");
                System.out.println("Ваш баланс: " + guest.getLimit() + "$");
            }
        } else {
            guest.setLimit(guest.getLimit() - 5);
            System.out.println("К сожалению, сегодня не ваш день и вам не удалось никого накуканить!");
            System.out.println("Ваш баланс: " + guest.getLimit() + "$");
        }
    }

    public static void hotelInfo() {
        System.out.println("0 этаж - лобби (поиграть с пацанами в нарды и подымить чаху - бесплатно)\n" +
                "1 этаж - казино (дает возможность выиграть или проиграть деньги - минимальная ставка 1$)\n" +
                "2 этаж - номер (дает возможность отдохнуть и восстановить силы - бесплатно)\n" +
                "3 этаж - бардель (дает возможность почуствовать себя плохим парнем - 10$)\n" +
                "4 этаж - доктор (дает возможность вылечиться от всех болезней - 15$)\n" +
                "5 этаж - ресторан (дает возможность хорошо провести время и склеить цыпочку - 5$)\n");
    }
}