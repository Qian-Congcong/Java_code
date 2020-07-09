import java.util.Arrays;
import java.util.Scanner;

/**
 * program: 20200413
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-14 11
 * Time:56
 */
public class TestDemo2 {

    /**
     * 递归求 N 的阶乘
     * @param args
     */
    public static int recFactor(int n) {
       int ret = 1;
       int i = 1;
        while (i <= n) {
            ret *= i;
            i++;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(recFactor(num));
    }

    /**
     * 递归求 1 + 2 + 3 + ... + 10
     * @param args
     */
    public static int recSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recSum(n-1);
    }
    public static void main11(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(recSum(num));
        scanner.close();
    }

    /**
     * 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
     * @param args
     */
    public static void sequentPrint(int n) {
        if (n > 9) {
            sequentPrint(n/10);
        }
        System.out.print(n%10 +" ");
    }
    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        sequentPrint(num);
    }

    /**
     * 写一个递归方法，输入一个非负整数，返回组成它的数字之和
     * @param args
     */
    public static int sumNum(int n) {
        if (n < 10) {
            return n;
        }
        return n%10 + sumNum(n/10);
    }
    public static void main9(String[] args) {
        int num = 1729;
        System.out.println(sumNum(num));

    }

    /**
     * 递归求斐波那契数列的第 N 项
     * @param args
     */
    public static int fibonTwo(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fibonTwo(n-1) + fibonTwo(n-2);
    }
    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(fibonTwo(num));
    }

    /**
     * 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。
     * 并执行代码，求出结果
     * @param args
     */
    public static int sum(int num1, int num2) {
        return num1+num2;
    }
    public static double sum(double num1, double num2, double num3) {
        double sum = num1 + num2;
        return sum + num3;
    }
    public static void main7(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(sum(a, b));
        double n1 = 10.5;
        double n2 = 20.5;
        double n3 = 30.5;
        System.out.println(sum(n1, n2, n3));
    }

    /**
     * 求最大值方法的重载
     * 在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
     * 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
     * @param
     */
    public static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
    public static double max(double num1, double num2) {
        return num1 > num2 ? num1 : num2;
    }
    public static double  max(double num1, double num2, int num3) {
        /*double max = (num1 > num2 ? num1 : num2);
        return max > num3 ? max : num3;*/
        return max(max(num1,num2),num3);
    }
    public static void main6(String[] args) {
        int a = 10;
        int b = 35;
        System.out.println(max(a, b));
        double n1 = 10.5;
        double n2 = 20.5;
        System.out.println(max(n1, n2));
        System.out.println(max(n1, n2, b));
    }

    /**
     * 创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
     * ​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
     * @param
     */
    public static int maxNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
    public static int maxThreeNum(int num1, int num2, int num3) {
        return maxNum(maxNum(num1,num2),num3);
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        maxThreeNum(n1,n2,n3);
        System.out.println(maxThreeNum(n1, n2, n3));
    }

    /**
     * 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
     * @param args
     */
    public static int[] adjustPos(int[] arr) {
        int[] tmp = new int[arr.length];
        int right = arr.length;
        int left = 0;
        int i = 0;
        while (left < right) {
            if (arr[i]%2 != 0) {
                tmp[left] = arr[i];
                left++;
            }else {
                tmp[right-1] = arr[i];
                right--;
            }
            i++;
        }
        return tmp;
    }
    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] tmp  = adjustPos(array);
        System.out.println(Arrays.toString(tmp));
    }

    /**
     * 求1！+2！+3！+4！+........+n!的和
     *
     */
    public static int factorSum(int n) {
        int ret = 1;
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            ret = 1;
            for (int i = 1; i <= j; i++) {
                ret *= i;
            }
            sum += ret;
        }
        return sum;
    }
    public static int factorDumTwo(int n) {
        int ret = 1;
        int sum = 0;
        int i = 1;
        while (i <= n) {
           ret *= i;
           sum += ret;
           i++;
        }
        return sum;
    }
    public static int factor(int n) {
        int ret = 1;
        int i = 1;
        while (i <= n) {
            ret *= i;
            i++;
        }
        return ret;
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        factorSum(num);
        System.out.println(factorSum(num));
        factorDumTwo(num);
        System.out.println(factorDumTwo(num));
        factor(num);
        System.out.println(factor(num));
    }

    /**
     * 求斐波那契数列的第n项。(迭代实现)
     *
     */
    public static int fibon(int n) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        for (int i = 3; i <= n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        fibon(num);
        System.out.println(fibon(num));

    }

    /**
     * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
     * @param
     */
    public static void findOneNum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
    public static int findNum(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            n ^= arr[i];
        }
        return n;
    }
    public static void main1(String[] args) {
        int[] array = {1,1,2,2,4,5,7,7,4};
        findOneNum(array);

        System.out.println(findNum(array));
    }
}
