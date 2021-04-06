
import java.util.*;


public class Main {
    public double average(int[] array) {
        int sum = 0;
        for(int i =0;i< array.length;i++){
            sum += array[i];
        }
        return ((double) sum/ array.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("\\[|]", "");
        String[] s = sin.split(", ");
        int[] arr = new int[s.length];
        if (s.length == 1 && s[0].isEmpty())
            System.out.println(0.0);
        else {
            for (int i = 0; i < s.length; ++i)
                arr[i] = Integer.parseInt(s[i]);
            System.out.println(new Main().average(arr));
        }
    }
}