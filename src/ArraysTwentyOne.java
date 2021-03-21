import java.util.Arrays;

public class ArraysTwentyOne {
    public static void main(String[] args) {
        int[] myArray;

        int myArrays[];

        int[] myArrayu ;
        myArrayu = new int[10];

        int[] myArr = new int[10];
        System.out.println(myArr.length);

        String[] season = new String[4];
        season[0] = "зима";
        season[1] = "весна";
        season[2] = "літо";
        season[3] = "осінь";

        String[] seasons = new String[] {"зима","весна","літо","осінь"};
        for (int y = 0; y< 4; y++){
            System.out.println(seasons[y]);
        }

        String[] seasona = {"зима","весна","літо","осінь"};

        int[] numbers = {190, -3, 17, 99, 26, 98, 43, -234, 35, 80};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        int [] numbersCopy = Arrays.copyOf(numbers,4);
//        System.out.println(Arrays.toString(numbersCopy));
        int[][] number = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] numberCopy = Arrays.copyOf(number, number.length);
        System.out.println("Равны ли эти двумерные массивы между собой?");
        System.out.println(Arrays.deepEquals(number, numberCopy));
        System.out.println(Arrays.deepToString(numberCopy));
    }
    }

