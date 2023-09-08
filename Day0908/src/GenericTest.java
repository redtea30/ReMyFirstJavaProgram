/**
 * ClassName:GenercityTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 8/9/202311:12 am
 * @Version 1.0
 */
public class GenericTest<E> implements Interface1<E> {

    private E name;


    @Override
    public <E1> MyList test(E1 e1) {
        String temp = "this is a list";
        MyList mylist = new MyList();
        mylist.str = temp;
        return mylist;
    }

    public <E> void test1(E e) {
        System.out.println(e);
        System.out.println(name);
    }

    public void setName(E name) {
        this.name = name;
    }

}

