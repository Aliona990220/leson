import java.util.Scanner;
public class
KeywordFinal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int n = s.nextInt();
        System.out.println("Введите второе число");
        int m = s.nextInt();
        int[] arr = new int[m + 1 - n];
        int i = 0;
        for (int r = n; r <= m; r++) {
            arr[i]= r;
            i++;
        }
    }
}