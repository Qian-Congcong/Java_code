import java.util.Arrays;
import java.util.Scanner;

/**
 * program: 20200421
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-21 12
 * Time:27
 */

public class TestDemo {

    public static int[] twoSum(int[] nums, int target) {
       boolean flg = false;
       int[] tmp = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (target -nums[i] == nums[j]) {
                    tmp[0] = nums[i];
                    tmp[1] = nums[j];
                    flg = true;
                }
            }
            if (flg) {
                return tmp;
            }
        }
        return tmp;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] tmp = twoSum(nums,9);
        System.out.println(Arrays.toString(tmp));
    }

    /**
     * 在排序数组中查找数字I
     * @param
     * @return
     */
    public static int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }
    public static void main5(String[] args) {
        int[] array = {5,7,7,8,8,10};
        System.out.println(search(array, 6));
    }

    //最小的 K 个数
    public static int[] getLeastNumbers(int[] arr, int k) {
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
        int[] arr2 = new int[k];
        for (int i = 0; i < k; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
    public static void main4(String[] args) {
        int[] array = {3,2,1};
        int[] array2 = {0,1,2,1};
        int[] tmp = getLeastNumbers(array,2);
        System.out.println(Arrays.toString(tmp));
    }

    /**
     * 数组中出现次数超过一半的数字
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
       /* int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (nums.length < 2*count) {
                return nums[i];
            }
        }
        throw new RuntimeException("数组中不存在这样的数字！");*/

        //优化
        int x = 0;
        int votes = 0;
        int count = 0;
        for (int num: nums) {
            if (votes == 0) {
                x = num;
            }
            votes += (num == x ? 1 : -1);
        }
        //验证 x 是否为众数
        for (int num: nums) {
            if (num == x) {
                count++;
            }
        }
        return count > nums.length/2 ? x : 0;//当无众数时返回 0
    }
    public static void main3(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElement(array));
    }

    //数组中奇数在前
    public static int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left]%2 != 0) {
                left++;
            }
            while (left < right && nums[right]%2 == 0) {
                right--;
            }
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        return nums;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        int[] tmp = exchange(array);
        System.out.println(Arrays.toString(tmp));
    }

    /**
     * 打印从1到最大的n位数
     * @param n
     * @return
     */
    public static int[] printNumbers(int n) {
        int count = 1;
        while (n != 0) {
            count *= 10;
            n--;
        }
        int[] tmp = new int[count - 1];
        for (int i = 0; i < count-1; i++) {
            tmp[i] = i + 1;
        }
        return tmp;
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = printNumbers(num);
        System.out.println(Arrays.toString(array));
    }
}
