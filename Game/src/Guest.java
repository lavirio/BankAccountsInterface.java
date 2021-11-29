public class Guest {
    private static String guestName;
    private static int guestAge;
    private static int limit;
    private static int decease;

    public Guest() {
    }

    public Guest(String guestName, int guestAge) {
        this.guestName = guestName;
        this.guestAge = guestAge;
        limit = 100;
        decease = 0;
    }

    public int getDecease() {
        return decease;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getGuestAge() {
        return guestAge;
    }

    public int getLimit() {
        return limit;
    }

    public void setDecease(int decease) {
        this.decease = decease;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void getGuestInformation() {
        if (guestAge % 10 == 1) {
            System.out.println("Гость №1:" +
                    " Имя - " + getGuestName() +
                    ", Возраст - " + getGuestAge() + " год, " + "вам доступно " + getLimit() + "$");
        } else if (guestAge % 10 == 0 || guestAge % 10 >= 5 || guestAge >= 12 && guestAge <= 19) {
            System.out.println("Гость №1:" +
                    " Имя - " + getGuestName() +
                    ", Возраст - " + getGuestAge() + " лет, " + "вам доступно " + getLimit() + "$");
        } else {
            System.out.println("Гость №1:" +
                    " Имя - " + getGuestName() +
                    ", Возраст - " + getGuestAge() + " года, " + "вам доступно " + getLimit() + "$");
        }
    }

}