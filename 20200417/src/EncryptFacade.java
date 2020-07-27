/**
 * program: 20200417
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-17 20
 * Time:22
 */
//加密外观类，充当外观类。
public class EncryptFacade {

    //维持对其他对象的引用
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade(){
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    //调用其他对象的业务方法
    public void fileEncrypt(String fileNameSrc,String fileNameDes){
        String plainStr = reader.Read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}