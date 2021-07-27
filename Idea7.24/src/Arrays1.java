/**
 * @author Gujm
 * @date 2021/7/26 9:58 下午
 */
import java.util.Arrays;
public class Arrays1 {
    public static void main(String[] args) {
//        boolean equals(int[] a, int[] b);
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 3, 2, 4};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);
    }
}
