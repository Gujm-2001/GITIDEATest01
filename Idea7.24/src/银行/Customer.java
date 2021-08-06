package 银行;

/**
 * @author Gujm
 * @date 2021/7/28 1:01 下午
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;//去掉cust呢
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
