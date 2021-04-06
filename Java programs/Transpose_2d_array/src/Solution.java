
import java.util.*;


public class Solution {
    public int[][] transpose(int[][] array) {
        int [][] trans = new int[array.length][array.length];
        for(int r=0;r< array.length;r++){
            for(int c=0;c< array.length;c++){
                trans[c][r]=array[r][c];
            }
        }
        return trans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("\\[|]", "");
        String[] s = sin.split(", ");
        int h=s.length;
        int[][] arr = new int[h][h];
        if(s.length == 1) {
            System.out.println("[["+s[0]+"]]");
        }else {
            int k = 0;
            for (int i = 0; i < Math.sqrt(h) && k <h; ++i){
                for (int j = 0; j < Math.sqrt(h) && k< h; ++j){
                    arr[i][j] = Integer.parseInt(s[k]);
                    k++;
                }
            }
            int[][] res = new Solution().transpose(arr);
            System.out.print("[");
            for(int c=0;c< Math.sqrt(h) ; c++){
                System.out.print("[");
                for (int t=0;t< Math.sqrt(h);t++){
                    System.out.print(res[c][t]);
                    if(t != (Math.sqrt(h))-1){
                        System.out.print(", ");
                    }
                }
                System.out.print("]");
                if (c != (Math.sqrt(h))-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
        }

    }
}
