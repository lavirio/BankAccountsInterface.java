public abstract class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void put(int amount) {
        if (amount < 0) {
            System.out.println("Операцию невозможно выполнить так как введаная сумма меньше 0");
            return;
        }
        System.out.println("Операция на пополнение счета на сумму " + amount + "$ - успешна выполнена!");
        balance += amount;
    }

    public boolean take(int amount) {
        if (amount > balance) {
            System.out.println("Операцию невозможно выполнить так как запрашиваемая сумма больше баланса");
            return false;
        } else {
            System.out.println("Операция по снятию денег со счета в размере " + amount + "$ - успешна выполнена!");
            balance -= amount;
            return true;
        }
    }

    public boolean send(BankAccount receiver, int amount) {
        if (balance > amount) {
            System.out.println("Перевод " + amount + "$ на " + receiver + "- успешно выполнен!");
            balance -= amount;
            receiver.put(amount);
            return true;
        } else {
            System.out.println("Запращиваемая вами сумма недоступна!");
            return false;
        }
    }
}
