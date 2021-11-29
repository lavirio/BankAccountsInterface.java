
public interface BankAccountsInterface {

    void put(Integer amount);

    void take(Integer amount) throws InterruptedException;

    void transfer(Integer amount, String newName);

}