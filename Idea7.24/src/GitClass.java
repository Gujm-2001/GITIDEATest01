/**
 * @author Gujm
 * @date 2021/7/24 4:51 下午
 */
import java.util.Scanner;
//婚恋网站
public class GitClass {
    public static void main(String [] args) {
        int score;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的年龄");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("请输入你是否相上了我");
        boolean love = scan.nextBoolean();
        System.out.println(love);

        System.out.println("请输入你的性别");
        String gender = scan.next();
        char genderChar = gender.charAt(0);
        System.out.println(genderChar);
        //对于char型的过去，Scanner没有提供相关的方法
    }
}
