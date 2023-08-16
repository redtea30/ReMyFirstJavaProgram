package Assignment;

/**
 * ClassName:Bankcount
 * Package: Assignment
 * Description:
 *
 * @Author Neko
 * @Create 16/8/20237:31 pm
 * @Version 1.0
 */
public class BankCount {
    private int accountNumber;
    private String accountHolder;
    private float balance;

    //构造方法、获取账户号码的方法、获取账户持有人姓名的方法、获取余
    //额的方法、存款方法、取款方法
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public float getBalance() {
        return this.balance;
    }

    public float withdraw(float num) {
        //存款并返回余额
        this.balance += num;
        return this.balance;
    }


    public float deposit(float num) {
        //取款并返回余额
        this.balance -= num;
        return this.balance;
    }

}
