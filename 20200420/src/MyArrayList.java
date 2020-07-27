import java.util.Arrays;

/**
 * program: 20200420
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-22 13
 * Time:18
 */

public class MyArrayList {

    public int[] elem;
    public int useSize;
    public static final int intCapacity = 10;

    public MyArrayList() {
        this.elem = new int[intCapacity];
        //this.useSize = 0;
    }
    public MyArrayList(int data) {
        this.elem = new int[intCapacity];
        this.useSize = data;
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < useSize; i++) {
            System.out.print(this.elem[i] +" ");
        }
        System.out.println();
    }
    private boolean isFull() {
        /*if (this.elem.length == this.useSize) {
            return true;
        }
        return false;*/
        return this.elem.length == this.useSize;
    }

    private void checkPos(int pos) {
        if (pos < 0 || pos > this.useSize) {
            throw new RuntimeException("pos位置不合法！");
        }
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        checkPos(pos);
        if (isFull()) {
            this.elem =
                    Arrays.copyOf(this.elem,2*this.elem.length);
        }
        for (int i = this.useSize - 1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.useSize++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.useSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.useSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    private boolean isEmpty() {
        return this.useSize == 0;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空！");
        }
        if (pos < 0 || pos >= this.useSize) {
            throw new RuntimeException("pos位置不合法！");
        }
        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (pos < 0 || pos >= this.useSize) {
            throw new RuntimeException("pos不合法！");
        }
        this.elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = search(toRemove);
        if (contains(toRemove)) {
            for (int i = index; i < this.useSize - 1; i++) {
                this.elem[i] = this.elem[i+1];
            }
            this.useSize--;
        }else {
            throw new RuntimeException("key不存在！");
        }
    }
    // 获取顺序表长度
    public int size() {
        return this.useSize;
    }
    // 清空顺序表
    public void clear() {
        this.useSize = 0;
    }
}
