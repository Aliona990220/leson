import java.util.Scanner;
public class Calculator {
    public int a;
    public int b;
    public String operation;
    public void scan() {
        Scanner sca = new Scanner(System.in);
        a = sca.nextInt();
        b = sca.nextInt();
        sca.nextLine();
        operation = sca.nextLine();
    }

    public float calculate(float a, float b, String operation) {
        if (operation.equals("+")) {
            float c = a + b;
            return c;
        }
        if (operation.equals("-")) {
            float d = a - b;
            return d;
        }
        if (operation.equals("*")) {
            float p = a * b;
            return p;
        }
        if (operation.equals("/")) {
            float q = a / b;
            return q;
        }
        return 0;
    }

    public static void main(String[] args) {
        Calculator calculato = new Calculator();
        calculato.scan();
        float res = calculato.calculate(calculato.a, calculato.b, calculato.operation);
        System.out.println(res);
    }
}





