public class Testing {
    public void test(){
        Calculator testIf = new Calculator();
        float f = testIf.calculate(1, 1, "+");
        if (f == 2) {
            System.out.println("ok");
        } else {
            System.out.printf("err 1 + 1 = %d is false \n true is = 2",f);
        }

        float w = testIf.calculate(10, 1, "-");
        if (w == 9){
            System.out.println("ok");
        }else {
            System.out.printf("err 10 - 1 = %d is false \n true is = 9",w);
        }

        float v = testIf.calculate(10, 2, "*");
        if (v == 20){
            System.out.println("ok");
        }else {
            System.out.printf("err 10 * 2 = %d is false \n true is = 20",v);
        }

        float p = testIf.calculate(15, 5, "/");
        if (p == 3){
            System.out.println("ok");
        }else {
            System.out.printf("err 15 / 5 = %d is false \n true is = 3",p);
        }
        float t = testIf.calculate(-20, 5, "+");
        if (t == -15) {
            System.out.println("ok");
        }else {
            System.out.printf("err -20 + 5 = %d \n true is = -15",t);
        }
        float w2 = testIf.calculate(-20, -5, "-");
        if (w2 == -15) {
            System.out.println("ok");
        }else {
            System.out.printf("err -20 - -5 = %d \n true is = -25",w2);
        }
        float w3 = testIf.calculate(0, 5, "-");
        if (w3 == -5) {
            System.out.println("ok");
        }else {
            System.out.printf("err 0 - 5 = %d \n true is = -5",w3);
        }
        float w4 = testIf.calculate(5.5f, 1.2f, "-");
        if (w4 == 1.3f) {
            System.out.println("ok");
        }else {
            System.out.printf("err 5.5 - 1.2 = %f \n true is = 1.3",w4);
        }
        float v2 = testIf.calculate(-10, 2, "*");
        if (v2 == -20){
            System.out.println("ok");
        }else {
            System.out.printf("err -10 * 2 = %d is false \n true is = -20",v2);
        }
        float v3 = testIf.calculate(-10, -20, "*");
        if (v3 == 200){
            System.out.println("ok");
        }else {
            System.out.printf("err -10 * -20 = %d is false \n true is = -200",v3);
        }
        float v4 = testIf.calculate(0, 2, "*");
        if (v4 == 0){
            System.out.println("ok");
        }else {
            System.out.printf("err 0 * 2 = %d is false \n true is = 2",v4);
        }
        float p1 = testIf.calculate(-15, 5, "/");
        if (p1 == -3){
            System.out.println("ok");
        }else {
            System.out.printf("err 15 / 5 = %d is false \n true is = -3",p1);
        }
        float p2 = testIf.calculate(15, 0, "/");
        if (p2 == 0){
            System.out.println("ok");
        }else {
            System.out.println("err cannot be divided by zero");
        }
    }
    public static void main(String[] args) {
        Testing b = new Testing();
        b.test();
    }
}
