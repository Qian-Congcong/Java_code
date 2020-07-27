/**
 * program: 20200418
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-18 21
 * Time:08
 */

import java.util.Arrays;

public class TestDemo2 {


    /**
     *给定两个整形数组，交换两个数组的内容
     * @param
    */
    public static void swapArrays(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            int[] arr3 = new int[arr2.length];
            for (int i = 0; i < arr2.length; i++) {
                arr3[i] = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = arr3[i];
            }
        }else {
            int[] arr3 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = arr3[i];
            }
        }

    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] array2 = {3,4,5,6,7,8,9};
        swapArrays(array,array2);
        for (int x:array) {
            System.out.print(x +" ");
        }
        System.out.println();
        for (int x:array2) {
            System.out.print(x +" ");
        }

    }

    /**
     *给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面
     */

    public static void swapIntArrays(int[] arr) {
        int left = 0;
        int right = arr.length-1;
       while (left < right) {
           while (left < right && arr[left]%2 == 0) {
               left++;
           }
           while (left < right && arr[right]%2 != 0) {
               right--;
           }
           int tmp = arr[left];
           arr[left] = arr[right];
           arr[right] = tmp;
       }
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        swapIntArrays(array);
        for (int x:array) {
            System.out.print(x +" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
