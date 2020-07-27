import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * program: 20200420
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-22 17
 * Time:37
 */

public class TestDemo3 {

    public static int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n-1)) > 0;
        return n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(sumNums(num));
    }

    public static int lastRemaining(int n, int m) {
        int ans = 0;

        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }
    public static void main4(String[] args) {
        int num1 = 5;
        int num2 = 3;
        System.out.println(lastRemaining(5, 3));
    }

    //扑克牌顺序
    public static boolean isStraight(int[] nums) {
        int joker = 0;
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) {
                joker++;
            }else if (nums[i] == nums[i+1]) {
                return false;
            }
        }
        return nums[4] - nums[joker] < 5;
    }

    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(isStraight(array));
    }

    /**
     * 左旋转字符串
     * @param s
     * @param n
     * @return
     */

    public static String reverseleftWords(String s, int n) {
        //1、字符串切片
        //return s.substring(n,s.length()) + s.substring(0,n);

        //2、列表遍历拼接
       /* StringBuilder res = new StringBuilder();
        for(int i = n; i < s.length(); i++)
            res.append(s.charAt(i));
        for(int i = 0; i < n; i++)
            res.append(s.charAt(i));
        return res.toString();*/
        //优化
        /*StringBuilder res = new StringBuilder();
        for(int i = n; i < n + s.length(); i++)
            res.append(s.charAt(i % s.length()));
        return res.toString();*/

        //3、字符串遍历拼接
        /*String res = "";
        for(int i = n; i < s.length(); i++)
            res += s.charAt(i);
        for(int i = 0; i < n; i++)
            res += s.charAt(i);
        return res;*/
        //优化
        String res = "";
        for(int i = n; i < n + s.length(); i++)
            res += s.charAt(i % s.length());
        return res;
    }
    public static void main2(String[] args) {
        String str = "abcdefg";
        System.out.println(reverseleftWords(str, 2));
    }
    /**
     * 和为 s 的两个数字
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[2];
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                res[0] = nums[left];
                res[1] = nums[right];
                return res;
            }else if (nums[left] + nums[right] < target) {
                left++;
            }else {
                right--;
            }
        }
        return res;
    }
    public static void main1(String[] args) {
        int[] array = {2,7,11,15};
        int[] array2 = {10,26,30,31,47,60};
        int[] tmp = twoSum(array,9);
        System.out.println(Arrays.toString(tmp));
    }
}
