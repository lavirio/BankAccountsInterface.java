import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    public DepositAccount(int balance) {
        super(balance);
    }

    @Override
    public void put(int amount) {
        super.put(amount);
        lastIncome = LocalDate.now();
    }

    @Override
    public boolean take(int amount) {
        if (lastIncome == null || lastIncome.isBefore(lastIncome.plusMonths(1))) {
            System.out.println("Снять деньги возможно только через месяц после последней операции по снятию!");
            return false;
        } else {
            super.take(amount);
            return true;
        }
    }
}