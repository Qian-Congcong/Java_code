import java.util.Scanner;

/**
 * program: 20200412
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-13 14
 * Time:40
 */
public class TestDemo2 {

    /*public static int factor(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factor(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int ret = factor(n);
        System.out.println(ret);//120
    }*/

   /* public static int sum(int num1, int num2) {
        return num1+num2;
    }

    public static double sum(double num1, double num2) {
        return num1+num2;
    }

    public static double sum(double num1, double num2, double num3) {
        return sum(sum(num1,num2),num3);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int ret1 = sum(a,b);
        System.out.println(ret1);

        double d1 = 10.5;
        double d2 = 20.5;
        double ret2 = sum(d1,d2);
        System.out.println(ret2);

    }*/

    /**
     * 实现代码:求解汉诺塔问题（提示，使用递归）
     * 汉诺塔问题是一个经典的问题。汉诺塔（Hanoi Tower），又称河内塔，源于印度一个古老传说。
     * 大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。
     * 大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。
     * 并且规定，任何时候，在小圆盘上都不能放大圆盘，且在三根柱子之间一次只能移动一个圆盘。
     * 问应该如何操作？
     * @param args
     */
    public static void main(String[] args) {
        
    }

    /**
     * 实现代码：求斐波那契数列的第N项
     * @param args
     */
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);

    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        fibonacci(num);
        System.out.println(fibonacci(num));
    }

    /**
     * 实现代码：写一个递归方法，输入一个非负整数，返回组成它的数字之和
     * @param args
     */
    public static int sumNumTwo(int n) {
        if (n < 10) {
            return n;
        }
        return n%10 + sumNumTwo(n/10);
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        sumNumTwo(num);
        System.out.println(sumNumTwo(num));
    }

    /**
     * 实现代码：按顺序打印一个数字的每一位（例如 1234 打印处1 2 3 4）
     * @param
     */
    public static void sequentPrint(int n) {
        if (n > 9) {
            sequentPrint(n / 10);
        }
        System.out.print(n % 10 + " ");
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        sequentPrint(num);
        scanner.close();
    }

    /**
     * 实现代码：递归求1 + 2 + 3 +……+ 10
     * @param
     */
    public static int sumNum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNum(n-1);
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        sumNum(num);
        System.out.println(sumNum(num));

    }

    /**
     * 实现代码:递归求N的阶乘
     * @param
     */
    public static int factor(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factor(n-1);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int ret = factor(num);
        System.out.println(factor(num));
        System.out.println(ret);
    }
}
