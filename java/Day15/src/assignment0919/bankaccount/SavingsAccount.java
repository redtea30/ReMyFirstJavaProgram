package assignment0919.bankaccount;

/**
 * ClassName:SavingsAccount
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 18/8/20237:24 pm
 * @Version 1.0
 */
public class SavingsAccount extends BankAccount {
    private double interestRate;//利率
    private double preserveMoney;
    //重写withdraw保留余额

    public SavingsAccount() {
        preserveMoney = 200;
        interestRate = 1.05;
    }

    @Override
    public boolean withdraw(double cash) {
        if (cash > (this.getBalance() - interestRate)) {
            System.out.println("取款超过限额");
            System.out.println("最多只能取" + maxWithdraw());
            return false;
        } else {
            return super.withdraw(cash);
        }

    }

    public double getInterestRate() {
        return interestRate;
    }

    public double maxWithdraw() {
        if (this.getBalance() >= preserveMoney) {
            return this.getBalance() - preserveMoney;
        } else return 0;
    }
}
