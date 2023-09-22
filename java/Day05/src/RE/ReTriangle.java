package RE;

/**
 * ClassName:ReTriangel
 * Package: RE
 * Description:
 *
 * @Author Neko
 * @Create 4/8/202311:05 pm
 * @Version 1.0
 */
public class ReTriangle {
    public static void main(String[] args) {
        //打印一个三角型
        int size = 10;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {//通过等差数列进行打印
                if (k == 0||k==2*i){//确定三角形的左边和右边范围
                    System.out.print("*");//范围k==0时，最左边。k==2*i时最右边，和该for循环的边界相等
                } else if (i==size-1) {//确定底边的范围
                    System.out.print("*");//i==size时为最低点
                }else {//剩下的地方填充空格
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
