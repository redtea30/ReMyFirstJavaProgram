package bankAccount;

/**
 * ClassName:CreditAccount
 * Package: bankAccount
 * Description:
 *
 * @Author Neko
 * @Create 28/8/20239:31 pm
 * @Version 1.0
 */
class CreditAccount extends BankAccount {
    double overdraftLimit = 1000;

    public CreditAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CreditAccount(double balance, int accountNumber, double overdraftLimit) {
        super(balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public CreditAccount(double balance, int accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    boolean withdraw(double amount) {
        if ((balance == 0 && overdraftLimit == 0) || amount <= 0) return false;
        else if ((balance + overdraftLimit) < amount) return false;
        else {
            balance -= amount;
            return true;
        }
    }

    @Override
    boolean deposit(double amount) {
        if (amount <= 0) return false;
        else {
            balance += amount;
            return true;
        }
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "overdraftLimit=" + overdraftLimit +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
