/**
 * @author Gujm
 * @date 2021/7/26 7:57 下午
 */
public class Triangle {
    public static void main(String[] args) {
        int[] arr[]=  new int[10][];
        for(int i = 0; i < 10; i++){
            arr[i] = new int[i + 1]; //重点
        }
        for (int a = 1; a < arr.length; a++){
            arr[a][0] = 1;
            arr[a][a-1] = 1;
        }
        arr[0][0] = 1;
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < i; j++){
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        for (int x = 0; x < 10; x++){
            for (int y = 0; y < (10 - x); y++){
                System.out.print(" ");
            } 
            for (int y = 0; y < x; y++){
                System.out.print(arr[x][y]+" ");
            }
            for (int y = 0; y < (10 - x);y++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
