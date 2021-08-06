package 客户信息管理.view;

import com.sun.xml.internal.rngom.ast.builder.CommentList;
import 客户信息管理.bean.Customer;
import 客户信息管理.survice.CustomerList;
import 客户信息管理.util.CMUtility;

import java.util.Optional;

/**
 * @author Gujm
 * @date 2021/7/30 2:41 下午
 */
public class CustomerView {
    CustomerList customerList = new CustomerList(10);

    public void enterMainMenu(){
        boolean isFlag = true;
        while (isFlag){
            System.out.println("------------客户信息------------");
            System.out.println("            1.添加客户");
            System.out.println("            2.修改客户");
            System.out.println("            3.删除客户");
            System.out.println("            4.客户列表");
            System.out.println("            5.退出\n");
            System.out.println("          请选择(1-5):");
            char menu = CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("你确定退出吗 （Y/N）");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }
    }
    private void addNewCustomer(){
        System.out.println("姓名");
        String name = CMUtility.readString(4);
        System.out.println("性别");
        char gender = CMUtility.readChar();
        System.out.println("年龄");
        int age = CMUtility.readInt();
        System.out.println("电话");
        String tel = CMUtility.readString(11);
        System.out.println("邮箱");
        String mail = CMUtility.readString(30);
        Customer customer = new Customer(name,gender,age,tel,mail);
        Boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
            System.out.println(" ");
        }
    }
    private void modifyCustomer(){

    }
    private void deleteCustomer(){

    }
    private void listAllCustomers(){
        Customer[] custs1 = this.customerList.getAllCustomers();
        for (int i = 0; i < customerList.getTotal(); i++){
            System.out.println(custs1[i]);
        }
    }
    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
