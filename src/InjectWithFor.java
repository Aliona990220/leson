public class InjectWithFor {
    public static void main(String[] args) {
        int[] intS = new int[]{4,3,2,1};
        int x = intS.length;
        for (int i = 1; i < 5; i++) {
            System.out.println("елемент " + i + "=" +x);
            x--;
        }
    }
}


