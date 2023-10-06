import java.lang.reflect.Field;

public class Test2 {


    public static void main(String[] args) {
        Game game = new Game();
        saveObject(game);


    }


    /**
     * todo 该方法需要将获取到的成员属性保存成为本地文件的形式
     * 先打印出来
     */
    public static void saveObject(Object obj) {
        //这个方法获取了名字和类型，但是不完整
        Class<?> aClass = obj.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            String name = declaredField.getName();
            Class<?> type = declaredField.getType();
            System.out.println(type + "--->" + name);

        }
    }

}
