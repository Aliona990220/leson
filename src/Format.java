import java.text.DecimalFormat;
public class Format {
    public static void main(String[] args) {
       double g = 4.43243;
        DecimalFormat d = new DecimalFormat("#.#");
        String second = d.format(4.4);
        System.out.println((second));
    }
}