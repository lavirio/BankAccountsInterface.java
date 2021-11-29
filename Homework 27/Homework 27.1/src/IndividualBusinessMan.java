public class IndividualBusinessMan extends Client {

    public IndividualBusinessMan(String name) {
        super(name);
        System.out.println("Счет открыт на " + getName() + ", номер счета " + getBankStatement() + ", баланс " + getSalary() + " рублей");
    }

    public void put(int amount) {
        double rate;
        if (amount < 1000) {
            rate = amount * 0.01;
        } else {
            rate = amount * 0.005;
        }
        System.out.println("Сумма для снятия составляет " + amount + " рублей и комиссия составляет " + rate + " рублей");
        super.put(amount + (int) rate);
    }

    public void getInfo() {
        System.out.println("Правила IndividualBusinessMan:");
        super.getInfo();
        System.out.println("При пополнении на сумму вменьше 1000 рублей взимается комиссия в размере 1% от суммы операции, а при сумме свыше 1000 рублей взимается комиссия в размере 0,5% от суммы операции.\n" +
                "Баланс " + getSalary() + " рублей");
    }
}
