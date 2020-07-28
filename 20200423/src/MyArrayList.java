/**
 * program: 20200423
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-23 15
 * Time:24
 */

import java.util.Arrays;

/**
 * 移除链表元素
 */

public class MyArrayList {
    private int[] elem;
    private int useSize;
    private static final int inCapacity = 10;

    public MyArrayList() {
        this.elem = new int[inCapacity];
        this.useSize = 0;
    }

    //添加元素
    public void add(int pos, int data) {
        if (this.useSize == this.elem.length) {
            this.elem =
                    Arrays.copyOf(this.elem,2*this.elem.length);
        }
        if (pos < 0 || pos > this.useSize) {
            throw new RuntimeException("pos位置不合法！");
        }
        for (int i = this.useSize; i > pos; i++) {
            this.elem[i] = this.elem[i-1];
        }
        this.elem[pos] = data;
        this.useSize++;
    }

    //删除一个val值所在的位置
    public void remove(int val) {
        int index = search(val);
        if (index == -1) {
            throw new RuntimeException("val不存在顺序表中！");
        }else {
            for (int i = index; i < this.useSize; i++) {
                this.elem[i] = this.elem[i+1];
            }
            this.useSize--;
        }
    }

    private int search(int val) {
        for (int i = 0; i < this.useSize; i++) {
            if (this.elem[i] == val) {
                return i;
            }
        }
        return -1;
    }

    //删除和val值相同的所有位置
    public void removeArray(int val) {
        int count = 0;
        for (int i = 0; i < this.useSize; i++) {
            if (this.elem[i] == val) {
                count++;
            }
        }
        while (count != 0) {
            remove(val);
            count--;
        }
    }

    //打印顺序表
    public void display() {
        for (int i = 0; i < this.useSize; i++) {
            System.out.print(this.elem[i] +" ");
        }
        System.out.println();
    }
}
