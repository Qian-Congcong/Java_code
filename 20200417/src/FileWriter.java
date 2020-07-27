import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * program: 20200417
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-17 20
 * Time:21
 */
//文件保存类，充当子系统类，用于保存文件，
// 在加密时需要指定源文件路径及路称（fileNameSrc）
// 和保存后目标文件路径及名称（fileNameDes）。
public class FileWriter {
    public void write(String encryptStr,String fileNameDes){
        System.out.println("保存密文，写入文件");

        try {
            FileOutputStream outFs = new FileOutputStream(fileNameDes);
            outFs.write(encryptStr.getBytes());
            outFs.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在异常");

        } catch (IOException e) {
            System.out.println("文件操作异常");       }
    }
}