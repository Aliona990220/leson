public class Namessecond {
    public static void main(String[] args) {
        String[] v = {"Братислав","Ney", "Sara", "Gideon"};
        String maxVaule = "";
        for (String t : v) {
            if (t.length() > maxVaule.length()) {
                maxVaule = t;
            }
        }
        System.out.println(maxVaule);
    }
}
