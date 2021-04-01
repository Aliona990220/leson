import java.util.Locale;

public class Leson {
    public static void main(String[] args) {
//        String a = "привіт";
//        a = a.toUpperCase();
//        System.out.println(a);
        String string1 = "Привіт";
        String string2 = " Бувай";
        String string3 = " Як справи?";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);

        StringBuilder sb = new StringBuilder("Привіт");
        System.out.println(sb.toString());
        sb.append(" як");
        sb.append(" твоє ім'я?");
        System.out.println(sb.toString());

        System.out.print("Привіт");
        System.out.println(" що будеш робити? ");
    }
}
