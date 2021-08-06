package 银行;


/**
 * @author Gujm
 * @date 2021/7/28 1:01 下午
 */
public class Bank{
    private Customer[] customers;
    private int numberOfCustomers;
    public Bank(){
        customers = new Customer[10];
    }
    public void addCustomer(String f, String l){
        Customer cust = new Customer(f, l);
        customers[numberOfCustomers++] = cust;
    }
    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }
    public Customer getCustomer(int index){
        if (index >= 0 && index < numberOfCustomers){
            return customers[index];
        }else{
            System.out.println("查无此人");
            return null;
        }
    }
}