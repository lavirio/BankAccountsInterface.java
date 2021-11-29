public class LegalPerson extends Client {

    public LegalPerson(String name) {
        super(name);
        System.out.println("Счет открыт на " + getName() + ", номер счета " + getBankStatement() + ", баланс " + getSalary() + " рублей");
    }

    public void take(Integer amount) {
        double rate = amount * 0.01;
        System.out.println("Сумма для снятия составляет " + amount + " рублей и комиссия составляет " + rate + " рублей");
        super.take(amount + (int) rate);
    }

    public void getInfo() {
        System.out.println("Правила LegalPerson:");
        super.getInfo();
        System.out.println("За все операции по снятию денежных средств взимается комиссия в размере 1%.\n" +
                "Баланс " + getSalary() + " рублей");
    }
}
