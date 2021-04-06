import java.text.DecimalFormat;

public class FormatThree {
    public static void main(String[] args) {
        double g = 11.43243;
        DecimalFormat d = new DecimalFormat("#");
        String second = d.format(4);
        System.out.println((second));
    }
}
