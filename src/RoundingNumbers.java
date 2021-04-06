import java.text.DecimalFormat;

public class RoundingNumbers<s> {
    public static void main(String[] args) {
        double n = 2.44543;
        DecimalFormat decimalFormat = new DecimalFormat("##");
        String secondResult = decimalFormat.format(24);
        System.out.println((secondResult));

    }

}
