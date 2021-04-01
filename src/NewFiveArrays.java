import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewFiveArrays {
    public static void main(String[] args) {
        String[] r = {"привіт", "бувай", "добраніч"};
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
        int[] e = new int[]{81, 33, 38232, 4554, 23, 45, 46, 67};
        for (int t : e) {
            System.out.println(t);
        }
        boolean[] d = new boolean[]{false, true, true, false};
        for (int s = 0; s < d.length; s++) {
            System.out.println(d[s]);
        }
        ArrayList<Integer> p = new ArrayList<Integer>();
        p.add(3434);
        p.add(4534);
        p.add(584839);
        for (int i : p) {
            System.out.println(i);
        }
        List<Float> b = Arrays.asList(23.3f, 3434.4f, 3.4f);
        for (int f = 0; f < b.size(); f++) {
            System.out.println(b.get(f));
        }

    }
}



