import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * program: 20200415c
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-17 08
 * Time:39
 */
public class TestDemo {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] tmp = Arrays.copyOfRange(array,0,5);
        System.out.println(Arrays.toString(tmp));
    }

    public static double myPow(double x, int n) {
        /*double tmp = 1.0;
        if (n < 0) {
            n = -n;
            for (int i = 0; i < n; i++) {
                tmp *= x;
            }
            return 1/tmp;
        }else {
            for (int i = 0; i < n; i++) {
                tmp *= x;
            }
            return tmp;
        }*/

        //优化
        if (x == 0) {
            return 0;
        }
        long tmp = n;
        double res = 1.0;
        if (tmp < 0) {
            x = 1 / x;
            tmp = -tmp;
        }
        while (tmp > 0) {
            if((tmp & 1) == 1) {
                res *= x;
            }
            x *= x;
            tmp >>= 1;
        }
        return res;
    }
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        int num2 = scanner.nextInt();
        System.out.println(myPow(num, num2));
    }

    public static int hammingWeight(int n) {
       /* int count = 0;
        while (n != 0) {
            count = n & 1;
            n >>>= 1;//右移赋值，左边空出的位以0填充
        }
        return count;*/
        int count = 0;
        while (n != 0) {
            count++;
            n &= n - 1;
        }
        return count;
    }
    public static void main6(String[] args) {
        int num = 00000000000000000000000000001011;
        System.out.println(hammingWeight(num));
    }

    public static int cuttingRopeTwo(int n) {
        if (n <= 1) {
            throw new RuntimeException("n不合法！");
        }
        if (n > 1 && n <= 3) {
            return n - 1;
        }
        int tmp = n;
        int mid = (int)1e9 + 7;
        long res = 1;
        while (tmp > 4) {
            res *= 3;
            res %= mid;
            tmp -= 3;
        }
        return (int)(res * tmp % mid);
    }
    public static int cuttingRope(int n) {
        if (n <= 0) {
            throw new RuntimeException("n不合法！");
        }
        if (n > 0 && n <= 3) {
            return n - 1;
        }
        int count = n / 3;
        int tmp = n % 3;
        if (tmp == 0) {
            return (int)Math.pow(3,count);
        }else if (tmp == 1) {
            return (int)Math.pow(3,count - 1)*4;
        }else {
            return (int)Math.pow(3,count)*2;
        }
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(cuttingRope(num));
        System.out.println(cuttingRopeTwo(num));
    }

    /**
     * 从pos1位置  挪到 pos2位置
     * @param pos1
     * @param pos2
     */
    public static void move(char pos1, char pos2) {
        System.out.print(pos1 +"->"+ pos2 +" ");
    }

    /**
     * @param n  盘子的个数
     * @param pos1  起始位置
     * @param pos2  中途位置
     * @param pos3  目的地位置
     */
    public static void hanoi(int n, char pos1, char pos2, char pos3) {
        if (n == 1) {
            move(pos1,pos3);
        }else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main4(String[] args) {
        hanoi(3,'A','B','C');
    }

    /**
     * 青蛙跳台阶
     * @param n
     * @return
     */
    public static int numWays(int n) {
        if (n == 1 ) {
            return 1;
        }else if (n == 2) {
            return 2;
        }
        return numWays(n-1) + numWays(n-2);
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(numWays(num));
    }


    /**
     * 旋转数组的最小数字
     */
    //1、旋转 2、查找
    public static int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (numbers[mid] < numbers[right]) {
                right = mid;
            }else if (numbers[mid] == numbers[right]) {
                right--;
            }else {
                left = mid + 1;
            }
        }
        return numbers[left];
    }

    public static void main2(String[] args) {
        int[] array = {3,4,5,1,2};
        int[] array1 = {2,2,2,0,1};
        System.out.println(minArray(array));
    }

    public static void bubbleSort(int[] arr) {
        boolean flg = false;
        for (int i = 0; i < arr.length - 1; i++) {
            flg = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg = true;
                }
            }
            if (!flg) {
                break;
            }
        }
    }

    public static void main1(String[] args) {
        int[] array = {1,3,2,5,6,7,4,8,9};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        /*System.out.println();
        for (int x:array) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));*/
    }
}
