/**
 * program: 20200415b
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-16 07
 * Time:56
 */
abstract class OperatingSystemVersion {
    protected VideoFile vf;

    public void setVideo(VideoFile vf) {
        this.vf = vf;
    }

    public abstract void play(String fileName);
}
