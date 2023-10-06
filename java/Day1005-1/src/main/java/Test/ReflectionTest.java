package Test;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //三种获得对象的方法
        // new Student() --> Student 类对象
        Class<Student> studentClass = Student.class;
        //使用Class.forName()
        Class<?> studentClass1 = Class.forName("Test.Student");//类名需要使用全限定名，即com.test.project的形式
        //Object包下的方法，getClass()
        Class<? extends Student> studentClass2 = new Student().getClass();

        //常用方法，获取反射对象类名
        System.out.println(studentClass.getName());
        System.out.println(studentClass.getSimpleName());
        System.out.println(studentClass.getPackageName());

        //获取所有 public修饰的构造器
        Constructor<?>[] constructors = studentClass.getConstructors();
        System.out.println(constructors.length);//2

        //获取当前类的每个构造函数有多少个形参（必须是public修饰的才能查看）
        for (Constructor constructor : constructors) {
            System.out.println("getParameterCount() " + constructor.getParameterCount());
        }

        //获取指定构造函数
        Constructor<Student> constructor = studentClass.getConstructor(int.class);
        int parameterCount = constructor.getParameterCount();
        System.out.println(parameterCount);//1

        //获取所有构造函数的个数，包含private修饰的
        Constructor<?>[] declaredConstructors = studentClass.getDeclaredConstructors();
        System.out.println(declaredConstructors.length);

        //通过declaredConstructor获取private修饰的构造器
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(int.class, String.class, Date.class);

        //暴力访问? 设置访问权限为 true
        declaredConstructor.setAccessible(true);

        //通过newInstance()创建student对象
        Student student1 = declaredConstructor.newInstance(11, "大马", new Date());
        System.out.println(student1.toString());//Student(id=11, birth=Thu Oct 05 19:23:26 CST 2023, name=大马)


    }
}