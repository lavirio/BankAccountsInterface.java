import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое предложение от 100 символов:");
        String sentence = new Scanner(System.in).nextLine();

        System.out.println(sentence.replaceAll("\\W+"," ").trim().replaceAll(" ","\n"));
    }
}
