
import java.util.*;

public class Solution {

    public int[] moveValue(int[] array, int value){
        int[] update = new int[array.length];
        int counter=0,index=0;
        for(int i = 0 ; i < array.length ; i++){
            if (array[i] == value){
                counter++;
                update[array.length-counter] = array[i];
            }else{
                update[index] =array [i];
                index++;
            }
        }
        return update;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("\\[|]", "");
        int value = sc.nextInt();
        String[] s = sin.split(", ");
        int[] arr = new int[s.length];
        if (s.length == 1 && s[0].isEmpty())
            arr = new int[]{};
        else {
            for (int i = 0; i < s.length; ++i)
                arr[i] = Integer.parseInt(s[i]);
        }
        System.out.print("[");
        int[] res = new Solution().moveValue(arr,value);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i != res.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }
}