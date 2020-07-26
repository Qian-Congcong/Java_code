import java.util.Arrays;
import java.util.Scanner;

/**
 * program: 20200416
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-17 14
 * Time:54
 */

public class TestDemo {

    public static void swapArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
    }
    public static void main10(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array1 = {3, 4, 5, 6, 7, 8};
        swapArray(array,array1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
    }

    /**
     * 青蛙跳台阶
     * @param
     */
    public static int numWays(int n) {
        if (n == 1 ) {
            return 1;
        }else if (n == 2) {
            return 2;
        }
        return  (numWays(n-1) + numWays(n-2));
        /*int num1 = 1;
        int num2 = 2;
        int ret = 1;
        if (n == 1) {
            return 1;
        }else if (n == 2) {
            return 2;
        }
        for (int i = 2; i < n; i++) {
            ret = (num1 + num2) % 1000000007;
            num1 = num2;
            num2 = ret;
        }
        return ret;*/
    }
    public static void main9(String[] args) {
        int n = 7;
        System.out.println(numWays(n));
    }

    /**
     * 斐波那契数
     * @param
     */
    public static int fib(int n) {
        /*int num1 = 1;
        int num2 = 1;
        int ret = 0;
        if (n == 1 || n == 2) {
            return 1;
        }else {
            for (int i = 2; i < n; i++) {
                ret = (num1 + num2) % 1000000007;//求余操作，大数越界处理
                num1 = num2;
                num2 = ret;
            }
        }
        return ret;*/
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;//2
            a = b;//1
            b = sum;//2
        }
        return a;
    }
    public static void main8(String[] args) {
        int n = 2;
        System.out.println(fib(n));
    }

    /**
     *
     * @param
     */
    public static String replaceSpace(String s) {
        //StringBuffer()构造一个没有字符的字符串缓冲区，初始容量为16个字符。
        StringBuilder res = new StringBuilder();
        //toCharArray()将此字符串转换为新的字符数组。字符存在新建的字符数组中
        for(Character c : s.toCharArray()) {
            if(c == ' ') {
                res.append("%20");//将指定StringBuffer这个序列,对这个对象的引用
            } else {
                res.append(c);
            }
        }
        return res.toString();//toString返回表示此顺序中的数据的字符串
    }

    public static void main7(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }

    /**
     * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
     * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     *
     * @param args
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main6(String[] args) {
        int[][] array = {{1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int num = 20;
        System.out.println(findNumberIn2DArray(array, num));
    }

    /**
     * 实现一个方法 toString, 把一个整型数组转换成字符串.
     * 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]",
     * 注意 逗号 的位置和数量.
     * @param
     */
    public static String myToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i != arr.length -1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
    public static void main5(String[] args) {
        int[] array = {1,2,3};
        System.out.println(myToString(array));
    }

    /**
     * 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
     * @param args
     */
    public static int[] copyOf(int[] arr, int length) {
        int[] tmp = new int[length];
        for (int i = 0; i < length; i++) {
            tmp[i] = arr[i];
        }
        return tmp;
    }

    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int[] array2 = copyOf(array,4);
        System.out.println(Arrays.toString(array2));
    }

    /**
     * 给定一个有序整型数组, 实现二分查找
     * @param args
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            }else if (arr[mid] == target) {
                return mid;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,9,5,6,4,8};
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(binarySearch(array, num));
    }

    /**
     * 给定一个整型数组, 判定数组是否有序（递增）
     * @param args
     */
    public static boolean is_Sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,6,7,8};
        int[] array2 = {2,3,1,5,4,6};
        System.out.println(is_Sort(array));
        System.out.println(is_Sort(array2));
    }

    /**
     * 给定一个整型数组, 实现冒泡排序(升序排序)
     */
    public static void bubbleSort(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }
    public static void main1(String[] args) {
        int[] array = {1,3,5,2,4,8};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
