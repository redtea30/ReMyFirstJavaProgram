package bankAccount;

import java.util.Arrays;

/**
 * ClassName:List
 * Package: bankAccount
 * Description:
 *
 * @Author Neko
 * @Create 28/8/20239:30 pm
 * @Version 1.0
 */
class List {
    private BankAccount[] account = new BankAccount[0];
    private int count = 0;

    public int getCount() {
        return count;
    }

    List(BankAccount[] account) {
        this.account = Arrays.copyOf(this.account, this.account.length + account.length);
        System.arraycopy(account, 0, this.account, count, account.length);
        count += account.length;
    }

    List(BankAccount account) {
        expands();
        this.account[count++] = account;
    }

    private void expands() {
        if (account[account.length - 1] != null) account = Arrays.copyOf(account, account.length * 2);
    }

    public BankAccount[] getAccount() {
        return account;
    }

    public void setAccount(BankAccount[] account) {
        this.account = account;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Temp.List{" +
                "account=" + Arrays.toString(this.account) +
                ", count=" + this.count +
                '}';
    }
}
