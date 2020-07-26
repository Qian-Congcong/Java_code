/**
 * program: 20200415a
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-15 22
 * Time:19
 */
class Client {
    public static void main(String[] args) {
        Image image1,image2;
        ImageImp imp;
        image1 = (Image)XMLUtil.getBean("image");
        image2 = (Image)XMLUtil.getBean("image");
        imp = (ImageImp)XMLUtil.getBean("os");
        image1.setImageImp(imp);
        image2.setImageImp(imp);
        image1.parseFile("喜洋洋");
        image1.parseFile("懒洋洋");
    }
}
