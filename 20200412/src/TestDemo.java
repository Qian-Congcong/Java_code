import java.util.Random;
import java.util.Scanner;

/**
 * program: 20200412
 * Created with IntelliJ IDEA.
 * Description:
 * IDEA调试
 * 1、打断点
 * 2、找甲壳虫
 * User: YouName
 * Date:2020-04-13 11
 * Time:20
 */
public class TestDemo {

    public static void main10(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a +" "+ b);
    }

    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }

    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sum(a, b));
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        System.out.println(sum(d1, d2));
    }

    public static int sum(int x, int y) {
        return x+y;
    }

    public static double sum(double x, double y) {
        return x+y;
    }

    public static double sum(double x, double y, double z) {
        return x+y+z;
    }

    public static int factor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        return sum;
    }

    public static int fac(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }

    public static void main8(String[] args) {
        System.out.println(factor(7));
    }

    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int ret = sum(n1,n2);
        System.out.println(ret);
        scanner.close();

    }

    public static int maxNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
    //求三个数的最大值
    public static int maxThreeNum(int num1, int num2, int num3) {
       /* int max = (num1 > num2 ? num1 : num2);
        return (max > num3 ? max : num3);*/
        return maxNum(maxNum(num1,num2),num3);
    }

    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        /*int ret = maxThreeNum(n1, n2, n3);
        System.out.println(ret);*/
        //System.out.println(maxThreeNum(n1,n2,n3));
        System.out.println(maxThreeNum(n1, n2, n3));//maxThreeNum.sout 回车
        scanner.close();
    }

    /**
     * 完成猜数字游戏
     */
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(100);
        while (true) {
            System.out.println("请输入猜的数字：>");
            int num = scan.nextInt();
            if (num > randNum) {
                System.out.println("猜的数字大了");
            }else if (num == randNum) {
                System.out.println("猜对了");
                break;
            }else {
                System.out.println("猜的数字小了");
            }
        }
    }


    /**
     * 输出一个整数的每一位.
     * @param
     */
    public  static  void is_Print(int n) {
        if (n > 9) {
            is_Print(n/10) ;
        }
        System.out.print((n%10) +" ");
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        is_Print(num);

        scanner.close();
    }

    /**
     * 获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列
     * @param args
     */
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Integer.toBinaryString(num));

        System.out.println("奇数位序列");
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print(((num >> i) & 1) + " ");
        }
        System.out.println();
        System.out.println("偶数位序列");
        for (int i = 31; i >= 1; i -= 2) {
            System.out.print(((num >> i) & 1) + " ");
        }
        scanner.close();
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        System.out.println(count);
    }

    /**
     * 写一个函数返回参数二进制中 1 的个数 比如： 15
     * @param args
     */
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //0000 1111
        //0000 0001
        //0000 0001
        int count = 0;
        for (int i = 0; i < 32; i++) {
           /* if ((num & 1)15 == 1) {
                num = num >> 1;
                count++;
            }*/

            if (((num >> i) & 1) == 1) {
                count++;
            }
        }
        System.out.println(count + "个1");

        //System.out.println("Hello!");
    }
}
