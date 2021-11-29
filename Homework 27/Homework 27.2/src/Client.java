import java.util.Scanner;

public class Client {

    private String mobileNumber;
    private String email;
    private BankAccount bankAccount;

    public Client(String number, String email, BankAccount bankAccount) {
        this.mobileNumber = number;
        this.email = email;
        this.bankAccount = bankAccount;
    }

    public void take(BankAccount bankAccount) {
        System.out.println("Введите сумму для снятия:");
        Integer amount = new Scanner(System.in).nextInt();
        bankAccount.take(amount);
    }

    public void put(BankAccount bankAccount) {
        System.out.println("Введите сумму для пополнения:");
        Integer amount = new Scanner(System.in).nextInt();
        bankAccount.put(amount);
    }

    public void transfer(BankAccount bankAccount) {
        System.out.println("Введите сумму для перевода:");
        Integer amount = new Scanner(System.in).nextInt();
        System.out.println("Введите ФИО человека, которому хотите перевести деньги:");
        String name = new Scanner(System.in).nextLine();
        bankAccount.transfer(amount, name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "мобильный телефон: " + mobileNumber +
                ", email: " + email +
                ", тип счета:" + bankAccount;
    }
}