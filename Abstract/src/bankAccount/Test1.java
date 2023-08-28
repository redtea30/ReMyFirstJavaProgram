package bankAccount;

import java.util.Scanner;

/**
 * ClassName:Test1
 * Package: bankAccount
 * Description:
 *
 * @Author Neko
 * @Create 28/8/20239:29 pm
 * @Version 1.0
 */
public class Test1 {
    static List list;
    static Scanner scanner = new Scanner(System.in);
    // bankAccount.BankAccount account = new bankAccount.BankAccount();
    static BankAccount[] account;
    static BankAccount bk;

    static {
        account = new BankAccount[3];
        account[0] = new DebitAccount(114514.1, 114514);
        account[1] = new CreditAccount(114514.2, 114514);
        account[2] = new DebitAccount(114514.3, 114514);

        list = new List(account);
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        //bankAccount.BankAccount bank = new bankAccount.BankAccount();
        test1.preMenu();

    }

    public void mainMenu() {
        System.out.println("1. 取款");
        System.out.println("2. 存款");
        System.out.println("0. 退出");
    }

    public void preMenu() {
        int temp = switchesAccount();
        if (temp == 0) return;
        else if (temp != 1 && temp != 2) {
            System.out.println("你输入的不正确");
            preMenu();
        } else mainMenu();
    }

    public int switchesAccount() {
        int choice;
        System.out.println("请输入数字选择你的账户");
        accountToString();
        System.out.println("按0键退出");
        choice = scanner.nextInt() - 1;
        return choice;
    }


    public void accountToString() {
        int count = 1;
        for (BankAccount i : list.getAccount()) {
            System.out.print(count++ + ".\t");
            System.out.println(i.toString());
        }

    }
}
