import java.util.UUID;

public class DebitCard extends BankAccount {

    public DebitCard() {
        super();
    }

    public void put(Integer amount) {
        super.put(amount);
    }

    public void take(Integer amount) {
        double rate;
        if (amount > 50000) {
            rate = amount * 0.01;
        } else {
            rate = amount * 0.02;
        }
        super.take((int) (amount + rate));
        System.out.println("Сумма для снятия денежных средств со счета " + getUuid() + " составляет " + amount + " рублей и комиссия " + rate + " рублей");
    }

    public void transfer(Integer amount, String newName) {
        double rate;
        if (amount > 25000) {
            rate = amount * 0.005;
        } else {
            rate = amount * 0.01;
        }
        super.take((int) (amount + rate));
        super.transfer(amount, newName);

    }

    @Override
    public void getInfo() {
        System.out.println("Дебетова карта:\n" +
                "При снятии суммы до 50000 рублей, взимается комиссия 2%, а при снятии суммы свыше 50000 рублей, взимыется комиссия 1% от суммы перевода.\n" +
                "Пополнение без ограничений.\n" +
                "При перевод суммы до 25000, взимается комиссия 1%, а при снятии суммы свыше 50000 рублей, взимыется комиссия 0,5% от суммы перевода.");
    }

    @Override
    public String toString() {
        return " дебетовая карта, " +
                "баланс: " + getBalance() +
                " рублей, номер счета: " + getUuid();
    }
}

