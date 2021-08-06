package exer2;

/**
 * @author Gujm
 * @date 2021/8/2 7:05 下午
 */
public class CheckAcountTest {
    public static void main(String[] args) {
        CheckAccount ca = new CheckAccount(1122,20000,0.045,5000);
        ca.withdraw(5000);
        System.out.println("账户余额" + ca.getBalance());
        System.out.println("透支额度" + ca.getOverdraft());
        ca.withdraw(18000);
        System.out.println("账户余额" + ca.getBalance());
        System.out.println("透支额度" + ca.getOverdraft());
        ca.withdraw(3000);
        System.out.println("账户余额" + ca.getBalance());
        System.out.println("透支额度" + ca.getOverdraft());
    }
}
