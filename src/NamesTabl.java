public class NamesTabl {
    public static void main(String[] args) {
        String[] a = {"Міша", "Коля", "Аня", "Іванка"};
        String c = "_________________";
        String d = "| Name | length | ";
        System.out.println(c);
        System.out.println(d);
        for (String n : a) {
            System.out.printf("|------+--------|\n %s    +    %d  \n ",n ,n.length());

        }
    }
}