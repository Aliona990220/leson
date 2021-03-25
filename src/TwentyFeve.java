import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwentyFeve {
    public static void main(String[] args) {
        boolean[] g = new boolean[]{true,false};
        List<Boolean> b = Arrays.asList(true,true);
        ArrayList<Boolean> d = new ArrayList<Boolean>();
        d.add(false);
        d.add(false);
        d.add(false);
        for (boolean i : d){
            System.out.println(i);
        }

    }
}
