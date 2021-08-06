package 银行;

/**
 * @author Gujm
 * @date 2021/7/28 1:25 下午
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("gu","j");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        System.out.println(bank.getCustomer(0).getAccount().getBalance());
    }
}
