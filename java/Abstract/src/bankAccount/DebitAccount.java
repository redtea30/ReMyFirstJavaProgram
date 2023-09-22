package bankAccount;

/**
 * ClassName:DebitAccount
 * Package: bankAccount
 * Description:
 *
 * @Author Neko
 * @Create 28/8/20239:30 pm
 * @Version 1.0
 */
class DebitAccount extends BankAccount {
    public DebitAccount() {
    }

    public DebitAccount(double balance, int accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    boolean withdraw(double amount) {
        if (balance == 0 || amount <= 0) return false;
        else if (balance < amount) return false;
        else {
            balance -= amount;
            System.out.println("当前余额为  " + balance);
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
        return "DebitAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
