package assignment.bankaccount;

/**
 * ClassName:CheckingAccount
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 18/8/20237:24 pm
 * @Version 1.0
 */
public class CheckingAccount extends BankAccount {
    private double overdraft;//透支额度
    double compareUse = 1000;//这个作为比较的基准值


    public CheckingAccount() {//默认额度1000元
        double overdraft = 1000;
    }

    //重写withdraw可以透支

    @Override
    public boolean withdraw(double cash) {
        if (cash <= getBalance()) {
            setBalance(getBalance() - cash);
            return true;
        } else if (cash <= (getBalance() + overdraft)) {
            setBalance(0);
            System.out.println("总共取款" + cash + "透支账户使用" + (compareUse - overdraft));
            System.out.println("当前账户余额" + getBalance() + "透支账户余额" + overdraft);
            return true;
        } else if (getBalance() == 0) {
            overdraft -= cash;
            System.out.println("总共取款" + cash + "透支账户使用" + (compareUse - overdraft));
            System.out.println("当前账户余额" + getBalance() + "透支账户余额" + overdraft);
            return true;
        } else {
            System.out.println("不行，真的取不了");
            return false;
        }

    }
}
