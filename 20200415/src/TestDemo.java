import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * program: 20200415
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-15 11
 * Time:57
 */
public class TestDemo {

    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                count2++;
            }
            if (count == 1 && count2 == 1) {
                num1[0] = array[i];
            } else if (count == 1 && count2 == 2) {
                num2[0] = array[i];
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,2,5,6,6,1,4,7};
        int[] array2 = new int[1];
        int[] array3 = new int[1];
        FindNumsAppearOnce(array,array2,array3);
        System.out.print(array2[0] + " " + array3[0]);
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }else if (n == 1 || n == 2) {
            return 1;
        }else if (n > 39) {
            System.out.println("输入数值超出要求");
            return -1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Fibonacci(num));
    }

    public static int Sum_Solution(int n) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        }while(i <= n);
        return sum;
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Sum_Solution(num));
    }

    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            count = 0;
            for (int j = 0; j < length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count > 1) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
    public static void main4(String[] args) {
        int[] nums = {2,3,1,0,2,5,3};
        int[] duplication = new int[1];
        System.out.println(duplicate(nums, nums.length, duplication));
        System.out.println(Arrays.toString(duplication));

    }

    //1 1   2^0
    //2 2   2^1
    //3 4   2^2
    //4 8   2^3
    public static int JumpFloorII(int target) {
         return (int)Math.pow(2, target - 1);
    }
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println(JumpFloorII(target));
    }

    /**
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字重复了，
     * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        /*int count = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > 1) {
                tmp = nums[i];
            }
        }
        return tmp;*/
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num: nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
    public static void main2(String[] args) {
        int[] array =  {2,3,1,0,2,5,3};
        System.out.println(findRepeatNumber(array));
    }

    //初始化  1、合并  2、排序
    public static void merge(int[] A, int m, int[] B, int n) {
       System.arraycopy(A,0,A,n,m);

       int index = 0;
       int indexA ,indexB;
       for (indexA = n, indexB = 0; indexA < m + n && indexB < n;) {
           if (A[indexA] <= B[indexB]) {
               A[index++] = B[indexB++];
           }else {
               A[index++] = A[indexA++];
           }
       }
       while (indexA < m+n) {
           A[index++] = A[indexA++];
       }
       while (indexB < n) {
           A[index++] = B[indexB++];
       }
       Arrays.sort(A);
    }
    public static void main1(String[] args) {
        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5,6};
        
        merge(A,3,B,3);
        System.out.println(Arrays.toString(A));
    }
}
