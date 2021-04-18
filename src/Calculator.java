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
            return a + b;
        }
        if (operation.equals("-")) {
            return  a - b;
        }
        if (operation.equals("*")) {
            return a * b;
        }
        if (operation.equals("/")) {
            return a / b;
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





