package 客户信息管理.survice;
import 客户信息管理.bean.Customer;
/**
 * @author Gujm
 * @date 2021/7/30 2:40 下午
 */
public class CustomerList {
    private Customer[] customers;
    int total = 0;
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer){
        if (total >= 10){//还要改
            return false;
        }else{
            customers[++total] = customer;
            return true;
        }
    }
    public boolean replaceCustomer(int index, Customer cust){
        if (index < 0 || index >= total){
            return false;
        }else{
            customers[index] = cust;
            return true;
        }
    }
    public boolean deleteCustomer(int index){
        if (index < 0 || index >= total){
            return false;
        }else{
            customers[index] = null;
            for (int i = index; i < total - 1; i++){
                customers[i] = customers[i + 1];
            }
            return true;
        }
    }
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        if (total == 0){
            System.out.println("未找到用户");
            return null;
        }else{
            for (int i = 0; i < total; i++){
                custs[i] = customers[i];
            }
            return custs;
        }
    }
    public Customer getCustomer(int index){
        if (index < 0 || index >= total){
            System.out.println("未找到该用户");
            return null;
        }else {
            return customers[index];

        }
    }
    public int getTotal(){
        return total;
    }

}
