public class Main {
    public static void main(String[] args) {
        for (int i = 200; i < 211; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 220; i < 251; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 200; i < 251; i++){
            if (i == 211) {
                i = 220;
            }
            System.out.print(i + " ");
        }
    }
}
