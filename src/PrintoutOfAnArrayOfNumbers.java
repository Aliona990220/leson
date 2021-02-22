public class PrintoutOfAnArrayOfNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[]{5,4,3,2,1};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "-" + numbers[i]);
        }
    }
}
