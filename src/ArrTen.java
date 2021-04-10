import java.util.ArrayList;
public class ArrTen {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        int i = 1;
        while (i++<101){
            v.add(i);
        }
        System.out.print(v);
    }
}