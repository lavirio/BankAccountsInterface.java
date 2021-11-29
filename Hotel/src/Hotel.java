import java.util.Scanner;

public class Hotel {
    private final int LOBBY = 0;
    private int MAINFLOOR = 0;
    private final int BAR = 7;
    private final int GUESTPERMISSIONAGE = 18;
    private final int GUESTADOLESENCEAGE = 14;
    private final int GUESTYOUNGAGE = 12;
    private boolean isContinue1 = true;
    private boolean isContinue2 = true;
    private boolean isContinue3 = true;

    public void goUp(Guest guest) {
        while (isContinue1) {
            if(MAINFLOOR == BAR) {
                System.out.println("Вы поднялись на максимальный этаж № " + MAINFLOOR); return;}
            System.out.println("Подняться выше или спуститься ниже? (Up/Down)");
            Scanner scanner = new Scanner(System.in);
            if(scanner.nextLine().equals( "Down")) {
                isContinue1 = false;
                return;
            }
            if (guest.getGuestAge() >= GUESTPERMISSIONAGE) {if (MAINFLOOR < BAR){
                MAINFLOOR = MAINFLOOR + 1;
                System.out.println("Вы поднялись на этаж № " + MAINFLOOR);
            }
            else {System.out.println("Вы поднялись на максимальный этаж № " + MAINFLOOR); return;}}
            else if (guest.getGuestAge() < GUESTPERMISSIONAGE && guest.getGuestAge() >= GUESTADOLESENCEAGE) {
                int pool = 6;
                if (MAINFLOOR < pool) {
                    MAINFLOOR = MAINFLOOR + 1;
                    System.out.println("Вы поднялись на этаж № " + MAINFLOOR);
                }
                else {System.out.println("Вы поднялись на максимально разрешенный для Вас этаж № " + MAINFLOOR); return;}}
            else if (guest.getGuestAge() < GUESTADOLESENCEAGE && guest.getGuestAge() >= GUESTYOUNGAGE) {
                int maxFloor = 5;
                if (MAINFLOOR < maxFloor){
                    MAINFLOOR = MAINFLOOR + 1;
                    System.out.println("Вы поднялись на этаж № " + MAINFLOOR);}
                else {System.out.println("Вы поднялись на максимально разрешенный для Вас этаж № " + MAINFLOOR); return;}}
            else {
                System.out.println("Вам запрещено заселяться в отель!");
            }
        }
    }
    public void goDown(Guest guest) {
        if(MAINFLOOR != BAR && MAINFLOOR != LOBBY) {
            MAINFLOOR = MAINFLOOR - 1;
            System.out.println("Вы спустились на этаж № " + MAINFLOOR);}
        while (isContinue2) {
            if(MAINFLOOR == LOBBY) {return;}
            System.out.println("Спуститься ниже или остаться на этом этаже? (Down/Stay)");
            Scanner scanner = new Scanner(System.in);
            if(scanner.nextLine().equals("Stay")) {
                isContinue2 = false;
                System.out.println("Вы остались на этаже № " + MAINFLOOR);
                return;
            }
            if (guest.getGuestAge() >= GUESTPERMISSIONAGE) {if(MAINFLOOR != LOBBY) {
                MAINFLOOR = MAINFLOOR > LOBBY ? MAINFLOOR - 1 : MAINFLOOR;
                System.out.println("Вы спустились на этаж № " + MAINFLOOR);}
            else {System.out.println("Вы спустились на минимальный этаж № " + MAINFLOOR); return;}}
            else if (guest.getGuestAge() < GUESTPERMISSIONAGE && guest.getGuestAge() >= GUESTADOLESENCEAGE) {if(MAINFLOOR != LOBBY){
                MAINFLOOR = MAINFLOOR > LOBBY ? MAINFLOOR - 1 : MAINFLOOR;
                System.out.println("Вы спустились на этаж № " + MAINFLOOR);}
            else {System.out.println("Вы спустились на минимальный этаж № " + MAINFLOOR); return;}}
            else if (guest.getGuestAge() < GUESTADOLESENCEAGE && guest.getGuestAge() >= GUESTYOUNGAGE) {if(MAINFLOOR != LOBBY) {
                MAINFLOOR = MAINFLOOR > LOBBY ? MAINFLOOR - 1 : MAINFLOOR;
                System.out.println("Вы спустились на этаж № " + MAINFLOOR);}
            else {System.out.println("Вы спустились на минимальный этаж № " + MAINFLOOR); return;}}
        }
    }
    public void goOut(Guest guest) {
        if (guest.getGuestAge() < GUESTADOLESENCEAGE) {
            System.out.println("Вам запрешено покидать отель в одиночку!");
        } else {
            while (isContinue3) {
                if (MAINFLOOR != LOBBY) {
                    isContinue3 = false;
                } else {
                    System.out.println("Выйти из отеля или остаться? (Out/Stay)");
                    Scanner scanner = new Scanner(System.in);
                    if (scanner.nextLine().equals("Out")) {
                        isContinue3 = false;
                        System.out.println("Вы вышли из отеля!");
                    }
                    else {
                        System.out.println("Вы остались в лобби!");
                        isContinue3 = false;}
                }
            }
        }
    }
    public void info(Guest guest) {
        if(guest.getGuestAge() >= GUESTPERMISSIONAGE) {
            System.out.println("Вам разрешено посещать все этажи отеля!");
        }
        else if (guest.getGuestAge() < GUESTPERMISSIONAGE && guest.getGuestAge() >= GUESTADOLESENCEAGE) {
            System.out.println("Вам запрещено подниматься выше 6 этажа!");
        }
        else if (guest.getGuestAge() < GUESTADOLESENCEAGE && guest.getGuestAge() >= GUESTYOUNGAGE) {
            System.out.println("Вам запрещено подниматься выше 5 этажа!");
        }
        else {
            System.out.println("Вам запрещено заселяться в отель!");
        }
    }
}