public class MyTask {
    public static void main(String[] args) {
        for (int r = 1 ; r < 101 ; r = r + 1){
            if(r%2==0 && r%12 !=0){
                System.out.println(r);
            }
        }
    }
}
