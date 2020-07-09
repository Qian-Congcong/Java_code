import java.util.Scanner;

/**
 * program: 20200413
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-14 08
 * Time:36
 */
public class TestDemo {

    /**
     * 汉诺塔问题
     */
    //从pos1位置  挪到 pos2位置
    public static void move(char pos1, char pos2) {
        System.out.print(pos1 +"->"+ pos2 +" ");
    }
    //n：盘子个数   pos1：起始位置    pos2：中途位置   pos3：目的地位置
    public static void hanoi(int n, char pos1, char pos2, char pos3 ) {
        if (n == 1) {
            move(pos1,pos3);
        }else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        hanoi(n,'A','B','C');
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     */
    //1 1
    //2 2
    //3 3
    //4 5
    public static int JumpFloor(int target) {
        if(target == 1) {
            return 1;
        }else if (target == 2) {
            return 2;
        }
        return JumpFloor(target-1) + JumpFloor(target -2);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        JumpFloor(n);
        System.out.println(JumpFloor(n));
    }
}
