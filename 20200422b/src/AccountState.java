/**
 * program: 20200422b
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-22 20
 * Time:35
 */

//账户状态
abstract class AccountState {
    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}
