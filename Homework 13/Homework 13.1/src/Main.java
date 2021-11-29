public class Main {
    public static void main(String[] args) {
        for (char i = 65; i < 123; i++) {
            if (i == 91) {
                i = 97;
            }
            System.out.println((int) i + " = " + i);
        }
    }
}
