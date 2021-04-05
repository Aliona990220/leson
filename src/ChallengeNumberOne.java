import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengeNumberOne {
    public static void main(String[] args) {
        String[] arr = {"Доброго", " дня", " як ваші", " справи?"};
        StringBuilder f = new StringBuilder();
        for (String v : arr) {
            f.append(v);
        }
        System.out.print(f);


    }
}