import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {
    public static void main(String[] args) {
        int [] f = new int[]{1,2,3,4};
        for (int j : f) {
            System.out.println(j);
        }
        ArrayList<Integer> r = new ArrayList<Integer>();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        for (int e = 0; e< r.size(); e++){
            System.out.println(r.get(e) + "=" + e);
        }

        List<Integer> d = Arrays.asList(1,2,3,4);
        for (int t = 0; t< d.size(); t++){
            System.out.println(d.get(t) + "=" + t);
        }


    }
}
