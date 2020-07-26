/**
 * program: 20200415b
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-16 07
 * Time:54
 */
public class Client {
    public static void main(String args[]) {
        VideoFile vf;
        OperatingSystemVersion osType1 = new WindowsVersion();
        vf = new AVIFile();
        osType1.setVideo(vf);
        osType1.play("AVI");

        OperatingSystemVersion osType2 = new LinuxVersion();
        vf = new WMVFile();
        osType2.setVideo(vf);
        osType2.play("WMV");

        OperatingSystemVersion osType3 = new UnixVersion();
        vf = new RMVBFile();
        osType3.setVideo(vf);
        osType3.play("RMVB");
    }

}
