import java.util.concurrent.atomic.AtomicInteger;

public class atomic {
    public static void main(String[] args) {
        //初始值为1
        AtomicInteger atom = new AtomicInteger(1);

        System.out.println(atom);//1
        System.out.println(atom.getAndIncrement());//1(2) 相当于后加一

        System.out.println(atom.incrementAndGet());//3 相当于前加一

        System.out.println(atom.getAndAdd(12));//3(15) 后加数

        System.out.println(atom.getAndSet(10));//15(10) 后替换
        System.out.println(atom);//10
        System.out.println(atom.get());//10 atomicInteger的特定方法


    }
}
