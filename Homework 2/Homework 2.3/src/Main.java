import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double euroCurrency = 80.50;
        double dollarCurrency = 70.40;

        System.out.println("Введите необходимую сумму в рублях:");
        double rubles = new Scanner(System.in).nextDouble();

        double dollarExchange = rubles / dollarCurrency;
        double euroExchange = rubles / euroCurrency;

        System.out.println("Ваши деньги - " + rubles + " рублей, составляют " + dollarExchange + " доллара и " + euroExchange + " евро" );
    }
}
