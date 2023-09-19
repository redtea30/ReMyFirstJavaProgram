package assignment0919;

/**
 * ClassName:Assignment.PascalTriangle
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 9/8/20234:53 pm
 * @Version 1.0
 */
public class PascalTriangle {
    public static void main(String[] args) {
        //Assignment.PascalTriangle

        int size = 20;


        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    arr[i][j] = 1;
                } else if (i > 0 && j > 0) {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];

                }
            }
        }

            for (int i = 0; i < arr[i].length-1; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

        }
    }

