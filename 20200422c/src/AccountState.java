/**
 * program: 20200422c
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-22 21
 * Time:52
 */
//抽象状态
abstract class AccountState {
    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}
