/**
 * program: 20200422c
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-22 21
 * Time:52
 */

//受限状态
class RedState extends AccountState {
    public RedState(AccountState state) {
        this.acc = state.acc;
    }

    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        System.out.println("帐号受限，取款失败");
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    //状态转换
    public void stateCheck() {
        if(acc.getBalance() > 0) {
            acc.setState(new GreenState(this));
        }else if (acc.getBalance() > -1000) {
            acc.setState(new YellowState(this));
        }
    }

}
