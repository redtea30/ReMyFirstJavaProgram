import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Account1 {
    public static void main(String[] args) {
        class Account {

            private static long nextId = 1;
            private long id;
            private double balance;

            public Account(double balance) {
                this.id = nextId++;
                this.balance = balance;
            }

            public static long getNextId() {
                return nextId;
            }

            public static void setNextId(long nextId) {
                Account.nextId = nextId;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public double getBalance() {
                return balance;
            }

            public void setBalance(double balance) {
                this.balance = balance;
            }
        }

        List<Account> list = new ArrayList<>();
        list.add(new Account(10.00));
        list.add(new Account(15.00));
        list.add(new Account(0));

        Map<Long, Account> accountMap = new HashMap<>();
        for(Account acc : list) {
            accountMap.put(acc.getId(), acc);
        }

        for(Long id : accountMap.keySet()) {
            Account acc = accountMap.get(id);
            System.out.println(acc.getId() + "-" + acc.getBalance());
        }
    }
}
