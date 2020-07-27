/**
 * program: 20200417
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-17 20
 * Time:22
 */
//客户端测试类
public class Program {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("E:/code/Hello.txt", "E:/code/des.txt");
    }
}