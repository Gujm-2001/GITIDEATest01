package atstic;

/**
 * @author Gujm
 * @date 2021/8/4 9:31 下午
 */

//public class Account {
//    public static void main(String[] args) {
//        Account m1 = Account.getInstance() ;
//        Account m2 = Account.getInstance();
//        System.out.println((m1 == m2));
//    }
//    private Account(){
//    }
//    private static Account instance = new Account();
//    public static Account getInstance(){
//        return instance;
//    }
//}
public class Account{
    public static void main(String[] args) {
        Account m1 = Account.getinstance();
        Account m2 = Account.getinstance();
        System.out.println(m1 == m2);
        System.out.println(m1 == m2);
    }
    private Account(){
    }
    private static Account instance;
    public static Account getinstance(){
        if (instance == null){
            instance = new Account();
        }
        return instance;
    }
}