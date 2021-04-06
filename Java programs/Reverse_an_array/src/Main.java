
import java.util.*;




public class Main {
    public int[] reverse(int[] array){
        int temp ;
        for(int i=0;i< (array.length)/2;i++){
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("\\[|]", "");
        String[] s = sin.split(", ");
        int[] arr = new int[s.length];
        if (s.length == 1 && s[0].isEmpty())
            arr = new int[]{};
        else {
            for(int i = 0; i < s.length; ++i)
                arr[i] = Integer.parseInt(s[i]);
        }
        int[] res = new Main().reverse(arr);
        System.out.print("[");
        for(int i = 0; i < res.length; ++i) {
            System.out.print(res[i]);
            if(i != s.length - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}