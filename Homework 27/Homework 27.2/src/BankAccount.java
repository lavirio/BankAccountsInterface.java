import java.util.UUID;

public abstract class BankAccount implements BankAccountsInterface {

    private Integer balance;
    private UUID uuid;

    public BankAccount() {
        balance = 0;
        this.uuid = UUID.randomUUID();
    }

    public void put(Integer amount) {
        if (amount < 0) {
            System.out.println("Ожидайте, операция выполняется...");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Операцию невозможно выполнить так как сумма отрицательная");
            return;
        }
        System.out.println("Ожидайте, операция выполняется...");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance += amount;
        System.out.println("Деньги в размере " + amount + " рублей на счет " + getUuid() + " успешно зачислены");
    }

    public void take(Integer amount) {
        if (amount > balance) {
            System.out.println("Ожидайте, операция выполняется...");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Операцию невозможно выполнить так как запрашиваемая сумма больше баланса");
            return;
        }
        balance -= amount;
        System.out.println("Ожидайте, операция выполняется...");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Денежные средства в размере " + amount + " рублей со счета " + getUuid() + " успешно сняты");
    }

    public void transfer(Integer amount, String newName) {
        if (amount < 0) {
            System.out.println("Ожидайте, операция выполняется...");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Операцию невозможно выполнить так как сумма отрицательная");
            return;
        }
        System.out.println("Ожидайте, операция выполняется...");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance -= amount;
        Bank.bankStatements.get(newName).getBankAccount().setBalance(Bank.bankStatements.get(newName).getBankAccount().getBalance() + amount);
        System.out.println("Операция по переводу денег со счета " + getUuid() + " на счет " + Bank.bankStatements.get(newName).getBankAccount().getUuid() + " успешно проведена");
    }

    public abstract void getInfo();

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public abstract String toString();
}