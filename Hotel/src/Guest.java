public class Guest {
    private final String guestName;
    private final int guestAge;

    public Guest(String name, int age) {
        this.guestName = name;
        this.guestAge = age;
    }

    public int getGuestAge() {
        return guestAge;
    }

    public String getGuestName(){
        return guestName;
    }

    public void guestInformation() {
        if (guestAge % 10 == 1) {
            System.out.println("Гость №1:" +
                    " Имя - " + getGuestName() +
                    ", Возраст - " + getGuestAge() + " год");
        }
        else if (guestAge % 10 == 0 || guestAge % 10 >= 5 && guestAge % 10 <= 9 || guestAge >= 12 && guestAge <= 19) {
            System.out.println("Гость №1:" +
                    " Имя - " + getGuestName() +
                    ", Возраст - " + getGuestAge() + " лет");
        }
        else  {
            System.out.println("Гость №1:" +
                    " Имя - " + getGuestName() +
                    ", Возраст - " + getGuestAge() + " года");
        }
    }
}