/**
 * @author Gujm
 * @date 2021/7/27 8:14 下午
 */
public class BankTest{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("G","jm");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println(bank.getCustomer(0).getFirstName()+"账户余额为"+balance);
    }
}
 class Bank {
    private Customer[] customers;
    private int numberOfCustomers;//客户个数
    public Bank(){
        customers = new Customer[10];
    }
    //添加客户
    public void addCustomer(String f, String l){
        Customer cust = new Customer(f,l);
        customers[numberOfCustomers++] = cust;
    }
    //获取客户个数
    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }
    //获取制定位置的客户
    public Customer getCustomer(int index){
        if(index >= 0 && index < numberOfCustomers){
        return customers[index];
        }else{
            return null;
        }
    }
}
 class Account{
    private double balance;
    public Account(double init_balance){
        this.balance = init_balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("存钱成功");
        }
    }
    public void withdraw(double amt){
        if (balance >= amt){
            balance -= amt;
            System.out.println("取钱成功");
        }
        else {
            System.out.println("余额不足");
        }
    }
}
 class Customer{
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;
    }
     public String getFirstName() {
         return firstName;
     }

     public String getLastName() {
         return lastName;
     }
     public void setAccount(Account account) {
         this.account = account;
     }
     public Account getAccount() {
         return account;
     }
}