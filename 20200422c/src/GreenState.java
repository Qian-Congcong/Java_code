/**
 * program: 20200422c
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-22 21
 * Time:52
 */

//正常状态
class GreenState extends AccountState{
    public GreenState(Account acc) {
        this.acc = acc;
    }

    public GreenState(AccountState state) {
        this.acc = state.acc;
    }

    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
    }

    public void computeInterest()
    {
        System.out.println("正常状态，无须支付利息！");
    }

    //状态转换
    public void stateCheck() {
        if (acc.getBalance() > -1000 && acc.getBalance() <= 0) {
            acc.setState(new YellowState(this));
        }else if (acc.getBalance() <= -1000 ) {
            acc.setState(new RedState(this));
        }
    }
}
