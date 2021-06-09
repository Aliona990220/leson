import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LessonThirtySeven {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "c" + separator + "Users" + separator + "alion" + separator + "Downloads" + separator + "second" + separator + "test37";
        File file = new File(path);

        Scanner scan = new Scanner(file);
        while (scan.hasNextLine());
        System.out.println(scan.nextLine());

    }
}
