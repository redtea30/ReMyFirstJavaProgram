import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 这是序列化练习，完全不记得了
 * 其实是摸鱼摸得太多有副作用了
 */
public class SerializableTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("one");
        student.setAge(22);
        student.setGender("male");

        SerializableTest st = new SerializableTest();
        st.serialize(student);

    }

    /**
     * 序列化通过ObjectOutputStream进行输出
     * writeObject()方法写出去
     * 写出去的字节码文件我看不懂反正
     *
     * @param student
     */
    private void serialize(Student student) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("WeeklyTest/week12/resources/test.txt"));
            oos.writeObject(student);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
