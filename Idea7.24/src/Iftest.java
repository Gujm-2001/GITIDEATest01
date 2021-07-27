/**
 * @author Gujm
 * @date 2021/7/25 1:45 下午
 */
import java.util.Random;
import java.util.Scanner;
public class Iftest {
    public static void main(String[] args) {
        System.out.println("请输入成绩");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score == 100){
            System.out.println("奖励一辆BMW");
        } else if (score > 80){
            System.out.println("奖励一台iphone xs max");
        } else if (score >= 60){
            System.out.println("奖励一台pad");
        } else{
            System.out.println("什么奖励都没有");
        }
    }
}
