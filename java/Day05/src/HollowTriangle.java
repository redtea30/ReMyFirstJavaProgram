/**
 * ClassName:HollowTriangle
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 4/8/202312:34 pm
 * @Version 1.0
 */
public class HollowTriangle {
    public static void main(String[] args) {
        //输入行数 显示如图所示的空心三角形
        /*      *
         *   *
         *       *
         * * * * * * *
         */

        int height = 11;
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < height - i; j++) {//左边空白
                System.out.print("-");
            }

            for (int k = 0; k < 2 * i - 1; k++) {//三角形范围
//                System.out.print("*");

                if (i == height - 1) {//最后一行
                    System.out.print("*");
                } else if (k == 0 || k == 2 * i - 2) {//开头和末尾
                    System.out.print("*");//k=0从第0行打印，可以打印其他图形？
                } else {
                    System.out.print(" ");
                }






            }
            System.out.println();
        }




/*        for(int a=1;a<=7;a++){//控制三角形高度

            for(int b=1;b<=7-a;b++){ //控制*前的空格数量
                System.out.print(" "); //输出空格,输出7-a个空格后结束进入下一个循环
            }
            for(int b=0;b<=2*a-1;b++){
                //1,3,5
                *//*
         * 控制字符的数量，首行1个，第二行3个，第三行5个以此类推得出每行数量为2*b-1
         *//*
                if(a==7&&(b%2==0)){//确定最后一行*的位置
                    System.out.print("*");
                }else if(b==0||b==2*a-2){//确定*的位置为开头或结尾
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();//换行
        }*/

    }
}
