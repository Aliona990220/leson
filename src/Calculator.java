import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = v.nextInt();
        int b = v.nextInt();
        int c = a + b;
        System.out.println("результат" + c);
        System.out.println("Введіть число");
        int r = v.nextInt();
        int t = v.nextInt();
        int d = r - t;
        System.out.println("результат" + d);
        System.out.println("Введіть число");
        int e = v.nextInt();
        int q = v.nextInt();
        int w = e * q;
        System.out.println("результат" + w);
        System.out.println("Введіть число");
        int i = v.nextInt();
        int o = v.nextInt();
        int p = i / o;
        System.out.println("результат" + p);
    }
}