public class CardAccount extends BankAccount {

    public CardAccount(int balance) {
        super(balance);
    }

    @Override
    public boolean take(int amount) {
        double rate = amount * 0.01;
        if (rate + amount > getBalance()) {
            System.out.println("Операцию невозможно выполнить так как запрашиваемая сумма больше баланса!");
            return false;
        } else {
            take(amount + (int) rate);
            System.out.println("Операция на снятие " + amount + "$ со счета и комиссии " + (int) rate + " $ - успешна выполнена!");
            return true;
        }
    }

    @Override
    public String toString() {
        return "CardAccount ";
    }
}
