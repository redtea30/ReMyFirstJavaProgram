/**
 * ClassName:BankAccount
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

    abstract boolean withdraw(double amount);

    abstract boolean deposit(double amount);
}


class CreditAccount extends BankAccount {


    @Override
    boolean withdraw(double amount) {
        return false;
    }

    @Override
    boolean deposit(double amount) {
        return false;
    }
}

class DebitAccount extends BankAccount {

    @Override
    boolean withdraw(double amount) {
        return false;
    }

    @Override
    boolean deposit(double amount) {
        return false;
    }
}












