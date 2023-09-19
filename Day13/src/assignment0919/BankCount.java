package assignment0919;

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
    private double balance;

    public static void main(String[] args) {
        BankCount bc1 = new BankCount(114, "大王", 111);
        BankCount bc2 = new BankCount(114, "小王", 999.0, 111);


    }
    //构造方法、获取账户号码的方法、获取账户持有人姓名的方法、获取余
    //额的方法、存款方法、取款方法

    public BankCount() {
    }

    public BankCount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankCount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public BankCount(float balance) {
        this.balance = balance;
    }

    public BankCount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public BankCount(int accountNumber, String accountHolder, double balance, int deposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (deposit > balance) System.out.println("余额不足");
        else balance -= deposit;
        this.balance = balance;
        System.out.println("余额" + balance);
    }

    public BankCount(int accountNumber, String accountHolder, int withdraw, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        balance += withdraw;
        this.balance = balance;
        System.out.println("余额" + balance);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public double withdraw(double num) {
        //存款并返回余额
        this.balance += num;
        return this.balance;
    }


    public void deposit(float num) {
        //取款并返回余额
        if ((this.balance - num) < 0) {
            System.out.println("余额不足");
            return;
        }
        this.balance -= num;
        System.out.println("余额为" + this.balance);
    }

}
