/**
 * program: 20200415a
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-15 21
 * Time:29
 */

//GIF格式图像：扩充抽象类
class GIFImage extends Image {
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName +"，格式为GIF。");
    }
}
