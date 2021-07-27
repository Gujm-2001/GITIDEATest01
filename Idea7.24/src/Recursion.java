/**
 * @author Gujm
 * @date 2021/7/27 4:26 下午
 */
public class Recursion {
    public static void main(String[] args){
        System.out.println(RecursionMethod.recursion(10));
    }
}
class RecursionMethod{
    public static int recursion(int i){
        if (i == 0){
            return i;
        }
        if (i == 1){
            return 4;
        }else{
            return 2 * recursion(i - 1) + recursion(i - 2);
        }
    }
}