/**
 * ClassName:StringTest1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 3/9/202311:31 pm
 * @Version 1.0
 */
public class StringTest1 {
    public static void main(String[] args) {
        String html = """
                ..............<html>
                ..............    <body>
                ..............        <p>Hello, world</p>
                ..............    </body>
                ..............</html>
                ..............""";
        html = html.replace(".", " ");
        html = html.stripIndent();
        System.out.println(html);
        //<html>
        //    <body>
        //        <p>Hello, world</p>
        //    </body>
        //</html>

        String test1 = "asdfsdfasdf";
        CharSequence char1 = test1.subSequence(0, test1.length());
        System.out.println(char1.toString());


    }
}
