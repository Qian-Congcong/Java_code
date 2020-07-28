import com.sun.media.jfxmediaimpl.HostUtils;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * program: 20200422b
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-22 20
 * Time:36
 */

//受限状态：具体状态类
class RestrictedState extends AccountState {
    public RestrictedState(AccountState state) {
        this.acc = state.acc;
    }

    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        System.out.println("账号受限，取款失败");
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    //状态转换
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormalState(this));
        }else if (acc.getBalance() > -2000) {
            acc.setState(new OverdraftState(this));
        }
    }

}
