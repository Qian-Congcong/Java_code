/**
 * program: 20200415b
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-16 07
 * Time:57
 */
class WindowsVersion extends OperatingSystemVersion{
    public void play(String fileName) {
        String osType = "Windows播放";
        this.vf.decode(osType,fileName);
    }
}
