import java.util.Arrays;

/**
 * program: 20200419
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-19 20
 * Time:25
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int intCapacity = 10;//初始容量 final修饰常量后续不可更改

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    //打印顺序表
    public void display() {
        for (int x: this.elem) {
            System.out.print(x + " ");
        }
/*
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }*/
        //System.out.println(Arrays.toString(this.elem));
        System.out.println();

    }

    private boolean isFull() {
        /*if (this.useSize == this.elem.length) {
            return true;
        }
        return false;*/
        return this.usedSize == this.elem.length;
    }

    private void checkPos(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法！");
        }
    }
    //在pos位置新增元素
    //1、判断数组为空
    //2、是否合法
    //3、后移元素，添加data
    public void add(int pos, int data) {

        checkPos(pos);
        /*if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("")
        }*/

        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }

        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //判断是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        //return -1;
        throw new RuntimeException("查找元素不存在！");
    }

    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    //获取pos 位置的元素
    public int getPos(int pos) {
        //
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空！");//手动抛出异常
        }
        //
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("pos位置不合法！");
        }
        return this.elem[pos];
    }

    //给pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("pos位置不合法！");
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字 key
    public void remove(int toRemove) {
        int index = search(toRemove);
        for (int i = index; i <= this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //清空顺序表
    public void clear() {
        for (int i = 0; i < this.usedSize; i++) {
            this.elem[i] = 0;
        }
        //this.usedSize = 0;
    }
}
