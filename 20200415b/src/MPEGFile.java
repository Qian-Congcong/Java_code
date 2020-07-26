
/**
 * program: 20200415b
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-16 07
 * Time:55
 */
class MPEGFile implements VideoFile {
    public void decode(String osType, String fileName) {
        System.out.println("操作系统:" + osType +"文件名称：" + fileName + " hehe");
    }
}
