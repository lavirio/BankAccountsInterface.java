public class Main {
    public static void main(String[] args) {
        BankAccount cardAccount = new CardAccount(1000);
        BankAccount depositAccount = new DepositAccount(2000);

        cardAccount.take(999);
        System.out.println("Ваш баланс составляет " + cardAccount.getBalance() + "$");
        cardAccount.put(100);
        System.out.println("Ваш баланс составляет " + cardAccount.getBalance() + "$");

        depositAccount.take(100);
        System.out.println("Ваш баланс составляет " + depositAccount.getBalance() + "$");
        depositAccount.put(100);
        System.out.println("Ваш баланс составляет " + depositAccount.getBalance() + "$");
        depositAccount.take(100);
        System.out.println("Ваш баланс составляет " + depositAccount.getBalance() + "$");
        System.out.println(cardAccount.send(cardAccount,  10));

    }
}
