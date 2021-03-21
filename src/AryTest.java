import java.util.ArrayList;

public class AryTest {
    public static void main(String[] args) {
        int [] n = new int[] {1,2,3,4,5};
        System.out.println(n);

        ArrayList<String> m  = new ArrayList<String> ();
        m.add("1");
        m.add("2");
        m.add("3");
        m.add("4");
        m.add("5");
        System.out.println(m);

        n[0] = 1;
        n[1] = 2;
        n[2] = 3;
        n[3] = 4;
        n[4] = 5;
        for (int i = 0; i < n.length; i++){
            System.out.println(n[i] + "=" + i );
        }
    }
}

