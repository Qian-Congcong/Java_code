/**
 * program: 20200417
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-17 20
 * Time:17
 */
//数据加密类，充当子系统类，用于实现加密
public class CipherMachine {

    public String encrypt(String plainText){
        System.out.println("数据加密，将明文转换成密文");
        String es ="";
        for(int i = 0;i < plainText.length();i++){
            String c = String.valueOf(plainText.charAt(i) % 7);
            es += c;
        }
        System.out.println(es);
        return es;

    }
}