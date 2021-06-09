import java.io.IOException;
import java.util.Scanner;

public class LesonEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
           int r = Integer.parseInt(s.nextLine());
            if (r != 0){
                try {
                    throw new ScannerExeption("Ввели щось крім нуля! ");
                } catch (ScannerExeption scannerExeption) {
                    scannerExeption.printStackTrace();
                }
            }
        }
    }
}
