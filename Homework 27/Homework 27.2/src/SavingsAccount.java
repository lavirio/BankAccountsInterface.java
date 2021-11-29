
public class SavingsAccount extends BankAccount {

    public SavingsAccount() {
        super();
    }


    public void put(Integer amount) {
        super.put(amount);
    }

    public void take(Integer amount) {
        super.take(amount);
    }


    public void transfer(Integer amount, String newName) {
        super.transfer(amount, newName);
    }

    @Override
    public void getInfo() {
        System.out.println("Сберегательный счет:\n" +
                "Снятие без ограничений.\n" +
                "Пополнение без ограничений.\n" +
                "Перевод без ограничений.");
    }

    @Override
    public String toString() {
        return " сберегательный счет, " +
                "баланс: " + getBalance() +
                " рублей, номер счета: " + getUuid();
    }
}
