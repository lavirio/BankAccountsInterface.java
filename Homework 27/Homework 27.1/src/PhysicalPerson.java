public class PhysicalPerson extends Client {

    public PhysicalPerson(String name) {
        super(name);
        System.out.println("Счет открыт на " + getName() + ", номер счета " + getBankStatement() + ", баланс " + getSalary() + " рублей");
    }

    public void getInfo() {
        System.out.println("Правила PhysicalPerson:");
        super.getInfo();
        System.out.println("Баланс " + getSalary() + " рублей");
    }
}
