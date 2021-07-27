package 第一个包;

/**
 * @author Gujm
 * @date 2021/7/26 11:04 上午
 */
public class Array {
    public static void main(String[] args) {
        int[] ids;//以为数组声明
        //静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids=  new int[]{1001,1002,1003,1004};
        //动态初始化:数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];
        char[] charArray = new char[5];
        names[0] = "sds";
        names[1] = "sad";
        names[2] = "dsa";
        System.out.println(names[1].charAt(1));
        System.out.println(names.length);
        System.out.println(charArray[0]);//   \u0000 是 0 不是'0'
        System.out.println(names[4]);
        int[][] arr2 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        String[][] arr3 = new String[3][2];
    }
}
