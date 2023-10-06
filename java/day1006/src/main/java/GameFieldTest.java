import java.lang.reflect.Field;

public class GameFieldTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Game> game = Game.class;

        //通过getFields获取所有属性的字段
        Field[] fields = game.getFields();
        System.out.println(fields.length);//1 只有country一项是public修饰的

        //通过getDeclaredFields获取所有属性的字段
        Field[] declaredFields = game.getDeclaredFields();
        System.out.println(declaredFields.length);//4 显示所有属性的长度，包括private修饰的

        //获取某个指定public修饰的字段
        //private修饰的无法获取
        Field country = game.getField("country");
        System.out.println(country);//public java.lang.String Game.country

        // 获取一个指定的任意修饰符修饰的字段
        Field name = game.getDeclaredField("name");
        System.out.println(name);//private java.lang.String Game.name
        System.out.println(name.getName());//name
        System.out.println(name.getType());//class java.lang.String

        //创建一个新的game对象
        Game newGame = new Game();
        newGame.setCountry("大清");//Game类的set方法
        System.out.println(newGame.getCountry());//大清
        // Field 对象调用 set 方法设置  第一个参数 是要设置的对象 要设置的值
        country.set(newGame, "大明");
        System.out.println(newGame.getCountry());//大明

        //isAccessible 测试是否能进行访问
        System.out.println(name.isAccessible());//false

        //name Field对象 访问符是private
        name.setAccessible(true);
        name.set(newGame, "喜加一");
        System.out.println(name.get(newGame));//喜加一

        System.out.println(name);//private java.lang.String Game.name
        //当前声明字段在哪个类
        System.out.println(name.getDeclaringClass());//class Game
        //当前声明字段的数据类型
        System.out.println(name.getGenericType());//class java.lang.String
        //查看当前字段的修饰符
        System.out.println(name.getModifiers());//2  --->   private
        System.out.println(country.getModifiers());//1 ---> Public





    }
}
