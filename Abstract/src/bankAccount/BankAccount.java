package bankAccount;

/**
 * ClassName:Temp.BankAccount
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 28/8/20235:16 pm
 * @Version 1.0
 */
abstract class BankAccount {
    double balance;
    int accountNumber;

    BankAccount() {
    }

    public BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    abstract boolean withdraw(double amount);

    abstract boolean deposit(double amount);

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + this.balance +
                ", accountNumber=" + this.accountNumber +
                '}';
    }
}
