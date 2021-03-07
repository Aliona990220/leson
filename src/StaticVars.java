public class StaticVars {
    private static int b;

    public static void main(String[] args) {
        StaticVars staticVars1 = new StaticVars();
        StaticVars staticVars2 = new StaticVars();

        System.out.println(StaticVars.getB());
        System.out.println(staticVars1.getB());

        staticVars1.setB(3);
        staticVars2.setB(4);

        System.out.println(staticVars1.getB());
        System.out.println(staticVars2.getB());
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        StaticVars.b = b;
    }
}

