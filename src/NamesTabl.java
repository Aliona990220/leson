public class NamesTabl {
    public static void main(String[] args) {
        String[] a = {"Міша", "Коля", "Аня", "Іванка"};
        String d = "Names   + Length ";
        System.out.println(d);
        for (String n : a) {
            String c = "--------+-------";
            System.out.printf("--------+-------\n %s    +    %d  \n ",n ,n.length());

        }
    }
}