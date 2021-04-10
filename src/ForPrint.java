import java.util.Arrays;
public class ForPrint {
    public static void main(String[] args) {
        int[] r = new int[100];
        for (int i = 1; i < r.length; i = i + 1) {
            r[i] = i;


        }
        for (int s : r) {
            System.out.println(s);
        }
    }

}