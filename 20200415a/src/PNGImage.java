/**
 * program: 20200415a
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-15 21
 * Time:20
 */

//PNG格式图像：扩充抽象类
class PNGImage extends Image {
    public void parseFile(String fileName) {
        //模拟解析PNG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为PNG。");
    }
}
