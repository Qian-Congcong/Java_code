/**
 * program: 20200415a
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-15 21
 * Time:21
 */

//抽象图像类：抽象类
abstract class Image {
    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }
    public abstract void parseFile(String fileName);
}
