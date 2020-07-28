/**
 * program: 20200422c
 * Created with IntelliJ IDEA.
 * Description:
 * User: YouName
 * Date:2020-04-22 21
 * Time:53
 */


public class Client {
    public static void main(String[] args) {
        Account acc = new Account("段誉",5.0);
        acc.deposit(100);
        acc.withdraw(200);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.withdraw(100);
        acc.computeInterest();
    }
}
