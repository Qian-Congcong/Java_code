/**
 * program: 20200422b
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-22 21
 * Time:29
 */
public class Client {
    public static void main(String[] args) {
        Account acc = new Account("李玉",0.0);
        acc.deposit(1000);//存款
        acc.withdraw(2000);//取款
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();//计算利息
    }
}
