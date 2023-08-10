import java.util.Random;

/**
 * ClassName:FIveFive
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Neko
 * @Create 10/8/20232:20 pm
 * @Version 1.0
 */
public class FIveFive {
    public static void main(String[] args) {
        //定义一个5*5的二维数组并初始化，找出数组中的最大值的坐标。
        //定义一个5*5的二维数组并初始化，找出最小值的坐标，计算出该坐标周边的所有元素之和


        Random rand = new Random();
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(91) + 10;//范围
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(",\t");
                }
            }
            System.out.println();
        }

        //定义一个5*5的二维数组并初始化，找出数组中的最大值的坐标。
        int max = -1;
        int indexI = -1;
        int indexJ = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("数组中最大值为" + arr[indexI][indexJ] + " 坐标为 X=" + (indexJ + 1) + "Y=" + (5 - indexI));

        //定义一个5*5的二维数组并初始化，找出最小值的坐标，计算出该坐标周边的所有元素之和

        //找出最小元素
        int min = max++;
        int indexMinX = -1;
        int indexMinY = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    indexMinX = j;
                    indexMinY = i;
                }
            }
        }

        System.out.println("数组中最小值为" + arr[indexMinY][indexMinX] + " 坐标为 X=" + (indexMinX + 1) + "Y=" + (5 - indexMinY));

        //最小元素周围求和

        //直接给5*5外边套一圈0
        int[][] sevenSeven = new int[7][7];

        for (int y = 0; y < sevenSeven.length; y++) {
            for (int x = 0; x < sevenSeven[y].length; x++) {
                if (y >= 1 && x >= 1 && x < sevenSeven.length - 1 && y < sevenSeven.length - 1) {//sevenSeven.length =7
                    sevenSeven[y][x] = arr[y - 1][x - 1];
                }
                System.out.print(sevenSeven[y][x] + "\t");
            }
            System.out.println();
        }

        //这里给最小值的坐标加一以适应新的sevenSeven的范围
        //(y < indexMinY + 1 && x < indexMinX + 1 && x > indexMinX - 1 && y < indexMinY - 1 &&  sevenSeven[y][x] !=sevenSeven[indexMinY][indexMinX])
/*        indexMinY++;
        indexMinX++;
        int minAround = 0;
        for (int y = 0; y < sevenSeven.length; y++) {
            for (int x = 0; x < sevenSeven[y].length; x++) {
                if () {
                    minAround += sevenSeven[y][x];
                }
            }
        }*/
        //以下是老师的做法，我实在是不想写了


/*        System.out.println("最小值是：" + min);
        System.out.println("最小值坐标是：" + indexX + ", " + indexY);
        int sum = (indexY == 0 ? 0 : arr[indexX][indexY - 1]) // 左边
                + (indexY == arr[0].length - 1 ? 0 : arr[indexX][indexY + 1]) // 右边
                + (indexX == 0 ? 0 : arr[indexX - 1][indexY]) // 正上方
                + (indexX == arr.length - 1 ? 0 : arr[indexX + 1][indexY]) // 正下方
                + (indexX == 0 || indexY == 0? 0 : arr[indexX - 1][indexY - 1])// 斜左上方
                + (indexX == 0 || indexY == arr[0].length - 1? 0 : arr[indexX - 1][indexY + 1]) // 斜右上方
                + (indexY == 0 || indexX == arr.length - 1? 0 : arr[indexX + 1][indexY - 1])// 斜左下方
                + (indexX == arr.length - 1 || indexY == arr[0].length - 1? 0 : arr[indexX + 1][indexY + 1]); // 斜右下方
        System.out.println(sum);
    }*/

       /* System.out.println(minAround);*/

    }
}
