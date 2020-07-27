import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * program: 20200417
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-17 20
 * Time:08
 */
//文件读取类，充当子系统类，用于读取文件。
public class FileReader {
    public String Read(String fileNameSrc) {

        System.out.println("读取文件，获取明文");
        StringBuffer sb = new StringBuffer();
        try {
            FileInputStream inFs = new FileInputStream(fileNameSrc);
            int data;
            try {
                while ((data = inFs.read()) != -1) {
                    sb = sb.append((char) data);
                }

                inFs.close();
                System.out.println(sb.toString());
            } catch (IOException e) {
                System.out.println("文件操作异常");
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在异常");
        }
        return sb.toString();
    }
}
