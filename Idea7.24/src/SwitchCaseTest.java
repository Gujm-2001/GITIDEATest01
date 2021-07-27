import com.sun.org.apache.bcel.internal.generic.SWITCH;

/**
 * @author Gujm
 * @date 2021/7/25 2:40 下午
 */
import java.util.Scanner;
public class SwitchCaseTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个整数");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int common = 1;
        for (int i = 1; i <= m && i <= n; i++){
            if (m % i == 0 && n % i == 0){
                common = i;
            }
        }
        System.out.println("m和n的公约数是： "+common);
    }
}
