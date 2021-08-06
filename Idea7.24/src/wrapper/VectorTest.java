package wrapper;

import java.util.Vector;
import java.util.Scanner;

/**
 * @author Gujm
 * @date 2021/8/4 3:58 下午
 */
public class VectorTest {
    public static void main(String[] args) {
        int maxScore = 0;
        Vector v = new Vector();
        Scanner scan = new Scanner(System.in);
        for(;;){
            System.out.println("请输入学生成绩 -1结束");
            int score = scan.nextInt();
            if (score < 0 ){
                break;
            }
            if(score > 100){
                System.out.println("非法输入");
                continue;
            }
//            Integer inScore = new Integer(score);
//            v.addElement(inScore);
            v.addElement(score);
            if (maxScore < score){
                maxScore = score;
            }
        }
        for (int i = 0; i < v.size(); i++){
            Object obj = v.elementAt(i);
            Integer inScore = (Integer) obj;
            int score = inScore.intValue();
        }
    }

}
