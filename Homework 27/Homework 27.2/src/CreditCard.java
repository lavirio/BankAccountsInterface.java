import java.util.UUID;

public class CreditCard extends BankAccount {

    public CreditCard() {
        super();
    }

    public void put(Integer amount) {
        if (amount < 15000) {
            double rate = amount * 0.05;
            super.put(amount);
            super.take((int) rate);
        } else {
            super.put(amount);
        }
    }

    public void take(Integer amount) {
        double rate;
        if (amount < 10000) {
            rate = amount * 0.025;
        } else if (amount > 10000 && amount < 50000) {
            rate = amount * 0.02;
        } else {
            rate = amount * 0.01;
        }
        super.take((int) (amount + rate));
        System.out.println("Сумма для снятия денежных средств со счета " + getUuid() + " составляет " + amount + " рублей и комиссия " + rate + " рублей");
    }

    public void transfer(Integer amount, String newName) {
    }

    @Override
    public void getInfo() {
        System.out.println("Кредитная карта:\n" +
                "При снятии суммы до 10000 рублей, взимается комиссия 2,5%, а при снятии суммы 10000 рублей до 50000 рублей, взимыется комиссия 2%, а при снятии суммы свыше 50000 рублей, взимается комиссия 1% от суммы перевода.\n" +
                "При пополнение на сумму до 15000 рублей, взимается комисся 5% от суммы перевода, а на сумму свыше 15000 рублей, комисся не взимается.\n" +
                "При перевод суммы до 50000 рублей, взимается комиссия 3%, а при переводе суммы свыше 50000 рублей, взимыется комиссия 0,5% от суммы перевода.");
    }

    @Override
    public String toString() {
        return " кредитная карта, " +
                "баланс: " + getBalance() +
                " рублей, номер счета: " + getUuid();
    }
}