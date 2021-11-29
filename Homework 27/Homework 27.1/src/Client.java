public abstract class Client {
    private int salary;
    private static Integer bankStatement = 1000000;
    private String name;

    public Client(String name) {
        this.name = name;
        bankStatement++;
    }

    public int getSalary() {
        return salary;
    }

    public Integer getBankStatement() {
        return bankStatement;
    }

    public String getName() {
        return name;
    }

    public void put(int amount) {
        if (amount < 0) {
            System.out.println("Сумма для пополнения меньше отрицательная");
            return;
        }
        System.out.println("Счет успешно пополнен на сумму " + amount + " рублей");
        salary += amount;
    }

    public void take(int amount) {
        if (amount > getSalary()) {
            System.out.println("Недостаточно денег на счете");
            return;
        }
        salary -= amount;
        System.out.println("Списание " + amount + " рублей со счета");
    }

    public void getInfo() {
        System.out.println("Пополнение и списание происходит без комиссии.\nПополнения отрицательное значение, операция невозможна.\nПри попытке снять сумму больше, чем есть на счете, операция невозможна.");
    }
}
