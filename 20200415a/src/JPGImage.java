/**
 * program: 20200415a
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-15 21
 * Time:20
 */

//JPG格式图像：扩充抽象类
class JPGImage extends Image {
    public void parseFile(String fileName) {
        //模拟解析JPG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName +"，格式为JPG。");
    }
}
