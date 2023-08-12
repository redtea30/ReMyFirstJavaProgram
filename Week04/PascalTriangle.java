/**
 * ClassName:PascalTriangle
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 12/8/20236:02 pm
 * @Version 1.0
 */
public class PascalTriangle {
    //杨辉三角
    //好像写太着急了，反正基本上没啥对的，感觉
    public static void main(String[] args) {

        int size = 10;
        makeTriangle(10);
    }

    public static void makeTriangle(int size) {

        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (i + 1); j++) {
                if (j == 0) {
                    arr[i][j]=1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
