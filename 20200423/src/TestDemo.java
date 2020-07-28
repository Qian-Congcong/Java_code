import java.util.Arrays;

/**
 * program: 20200423
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-23 09
 * Time:24
 */
public class TestDemo {

    /**
     * 顺时针打印矩阵
     * @param matrix
     * @return
     */
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int[] res = new int[(right+1)*(bottom+1)];
        int x = 0;
        while (true) {
            for (int i = left; i <= right; i++) {
                res[x++] = matrix[top][i];
            }
            if (++top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                res[x++] = matrix[i][right];
            }
            if (left > --right) {
                break;
            }
            for (int i = right; i >= left; i--) {
                res[x++] = matrix[bottom][i];
            }
            if (top > --bottom) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                res[x++] = matrix[i][left];
            }
            if (++left > right) {
                break;
            }
        }

        return res;
    }
    public static void main1(String[] args) {
        int[][] array = {{1,2,3},
                {4,5,6},{7,8,9}};
        int[][] array2 = {{1,2,3,4},
                {5,6,7,8},{9,10,11,12}};
        int[][] array3 = {{2},{3}};
        int[] tmp = spiralOrder(array3);
        System.out.println(Arrays.toString(tmp));
    }
}
