package assignment;


import java.util.Scanner;

/**
 * ClassName:BankAccountTest
 * Package: assignment
 * Description:
 *
 * @Author Neko
 * @Create 18/8/20237:27 pm
 * @Version 1.0
 */
public class BankAccountTest {
    static Scanner sc = new Scanner(System.in);
    static BankAccountTest bat = new BankAccountTest();

    public static void main(String[] args) {
        BankAccount bk = new BankAccount();

        while (true) {
            System.out.println("当前账户"+bk.getAccountNumber());
            menu();
            //调用不同菜单
            if (bk instanceof CheckingAccount) {
                checkingMenu();
            } else {
                checkInterestRate();
            }
            int input = sc.nextInt();

            if (input > 0 && input < 6) {
                switch (input) {
                    case 1 -> {
                        System.out.println("请输入存款金额");
                        double backToBank = sc.nextDouble();
                        bk.withdraw(backToBank);
                    }
                    case 2 -> {
                        if (bk instanceof SavingsAccount) {//这个判断是不是savingAccount
                            System.out.println("当前账户类型是SavingsAccount");
                            System.out.println("请输入取款金额");
                            double getCash = sc.nextDouble();
                            bk.withdraw(getCash);
                            if (getCash > bat.maxWithdraw(bk)) {
                                System.out.println("当前余额不足");
                                System.out.println("需要贷款么");
                                System.out.println("需要请输入 Y/y,不需要可以单击回车跳过");
                                String inputY = sc.next();
                                int checkY = inputY.indexOf("Y");
                                int checky = inputY.indexOf("y");
                                if (checky > -1 && checkY > -1) {
                                    bk = bat.switcherTOCheckingAccount(bk);
                                    bk.withdraw(getCash);
                                }else{
                                    bk.withdraw(getCash);
                                }
                            }
                        } else if (bk instanceof CheckingAccount) {//这个执行CheckingAccount，前面已经判断过类型了
                            System.out.println("当前账户类型是CheckingAccount");
                            System.out.println("请输入取款金额");
                            double getCash = sc.nextDouble();
                            bk.withdraw(getCash);
                        }

                    }
                    case 3 -> {
                        System.out.println("账户余额为： " + bk.getBalance());
                    }
                    case 4 -> {
                        System.out.println("退出");
                        break;
                    }
                    default -> System.out.println("你输入的不正确");
                }
            }
        }

    }

    /**
     * 就是个简单的menu
     */
    public static void menu() {
        System.out.println("1.存款");
        System.out.println("2.取款");
        System.out.println("3.显示余额");
        System.out.println("4.退出");
    }

    public static void checkingMenu() {
        System.out.println("5.还钱");
    }

    public static void checkInterestRate() {
        System.out.println("5.查看利率");
    }


    /**
     * 账户类型转换 强转为SavingsAccount
     * 理论上不会报错
     * 灵感来自于星火大模型
     *
     * @param
     */
    public SavingsAccount switcherTOSavingsAccount(BankAccount ca) {
        if (ca instanceof SavingsAccount) {
            SavingsAccount bk = (SavingsAccount) ca;
            return bk;
        }
        return null;
    }

    /**
     * 账户类型转换 强转为CheckingAccount
     * 理论上不会报错
     * 灵感来自于星火大模型
     *
     * @param
     */
    public CheckingAccount switcherTOCheckingAccount(BankAccount ca) {
        if (ca instanceof CheckingAccount) {
            CheckingAccount bk = (CheckingAccount) ca;
            return bk;
        }
        return null;
    }


    /**
     * 最大取款限额
     * 要求账户再SavingsAccount类下才成立
     *
     * @param
     * @return 可以取出的最大余额
     */
    public double maxWithdraw(BankAccount sa) {
        SavingsAccount bk = (SavingsAccount) sa;
        return bk.maxWithdraw();
    }

}
