
import java.util.*;




public class Main {
    public int[] sumEvenOdd(int[] array) {
        int[] sum = {0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum[0] += array[i];
            } else {
                sum[1] += array[i];
            }
        }
        return sum ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("\\[|]", "");
        String[] s = sin.split(", ");
        int[] arr = new int[s.length];
        if (s.length == 1 && s[0].isEmpty())
            System.out.println("[0, 0]");
        else {
            for (int i = 0; i < s.length; ++i) {
                arr[i] = Integer.parseInt(s[i]);
            }
            System.out.print("[");
            int[] res = new Main().sumEvenOdd(arr);
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i]);
                if (i != res.length - 1) System.out.print(", ");
            }
            System.out.print("]");

        }
    }
}