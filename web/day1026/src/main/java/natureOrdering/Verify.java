package natureOrdering;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Package-name: verify
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 26-10-2023  09:08
 * Describe：验证自然排序
 */

public class Verify {
    public static void main(String[] args) {
        User user1 = new User(25, "Alice", "alice@email.com");
        User user2 = new User(30, "Bob", "bob@email.com");
        User user3 = new User(28, "Charlie", "charlie@email.com");
        User user4 = new User(22, "David", "david@email.com");

        ArrayList<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        Object[] array = list.toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //[User(age=22, name=David, email=david@email.com), User(age=25, name=Alice, email=alice@email.com), User(age=28, name=Charlie, email=charlie@email.com), User(age=30, name=Bob, email=bob@email.com)]


    }
}
