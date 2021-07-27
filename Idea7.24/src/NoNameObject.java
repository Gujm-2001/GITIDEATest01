/**
 * @author Gujm
 * @date 2021/7/27 11:55 上午
 */
public class NoNameObject {
    public static void main(String[] args){
        Phone p = new Phone();
        new Phone().sendEmail();//匿名对象
        new Phone().price = 2000;
        new Phone().showPrice();//0.0
    }
}
class Phone{
    double price;
    public void sendEmail(){
        System.out.println("发送邮件");
    }
    public void showPrice(){
        System.out.println(price);
    }
}