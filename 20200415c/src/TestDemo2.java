import java.util.Arrays;

/**
 * program: 20200415c
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-20 14
 * Time:10
 */
public class TestDemo2 {
    public static void main(String[] args) {
        int[] array = {1,2,4,1,4};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }

    /**
     * 不规则的二维数组
     * @param args
     */
    public static void main3(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[]{1,2,3};
        array[1] = new int[]{4,5};
        //注意：C语言  是可以指定列  行可以自动推导
        // Java  行必须指定    列  不可以自动推导的
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }

    /**
     * 二维数组的打印方式
     * @param args
     */
    public static void main2(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        for ( int[] tmp : array ) {
            for (int x : tmp) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        /*for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*/
       /* for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }*/
        /*System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));*/



    }

    /**
     * 二维数组的定义方式
     * @param args
     */
    public static void main1(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array3 = new int[2][3];
    }
}
