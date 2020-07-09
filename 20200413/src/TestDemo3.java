import java.util.Arrays;

/**
 * program: 20200413
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-14 17
 * Time:07
 */
public class TestDemo3 {

    /**
     * 创建一个 int 类型的数组, 元素个数为 100,
     * 并把每个元素依次设置为 1 - 100
     * @param args
     */
    public static int[] arrayInit(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array = new int[100];
        arrayInit(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 实现一个方法 printArray, 以数组为参数,
     * 循环访问数组中的每个元素, 打印每个元素的值.
     * @param
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6};
        printArray(array);
    }

    /**
     * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素
     * 乘以 2 , 并设置到对应的数组元素上.
     * 例如 原数组为 {1, 2, 3},修改之后为 {2, 4, 6}
     * @param args
     */
    public static int[] transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3};
        transform(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
     * @param args
     */
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(sum(array));
    }

    /**
     * 实现一个方法 avg, 以数组为参数,
     * 求数组中所有元素的平均值(注意方法的返回值类型).
     * @param
     */
    public static double avg(int[] arr) {
        double sum = arr.length;
        double num = 0.0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        return num / sum;
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(avg(array));
    }
}
