package assignment;

import java.util.Scanner;

/**
 * ClassName:BankAccount
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 18/8/20235:27 pm
 * @Version 1.0
 */
public class BankAccount {
    private static int accountNumber;
    private static double balance;

    public BankAccount() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("登陆账号");
            System.out.println("请输入9位数字");
            //每次登陆都要输入，太麻烦了，先替换掉
/*            int input = sc.nextInt();
            if (input > 99999999 && input < 1000000000) {
                accountNumber = input;
                break;
            }*/
            int input = 100000000;
            accountNumber = input;
            break;

        }
    }

    public BankAccount(int account) {
        this.accountNumber = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNum) {
        this.accountNumber = accountNum;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void deposit(double cash) {
        balance += cash;
        System.out.println("取款" + cash);
        System.out.println("余额" + balance);

    }

    public boolean withdraw(double cash) {
        if (cash <= balance && cash > 0) {
            balance -= cash;
            System.out.println("取款" + cash);
            System.out.println("余额" + balance);
            return true;
        }
        return false;
    }


}


