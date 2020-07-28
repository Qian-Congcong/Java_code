/**
 * program: 20200422c
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-22 21
 * Time:52
 */

//透支状态
class YellowState extends AccountState {
    public YellowState(AccountState state) {
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

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    //状态转换
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new GreenState(this));
        }else if (acc.getBalance() == -1000) {
            acc.setState(new RedState(this));
        }else if (acc.getBalance() < -1000) {
            System.out.println("操作受限！");
        }
    }
}
