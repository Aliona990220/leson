import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Humanity {
    public static void main(String[] args) {
        try (ObjectOutputStream ser = new ObjectOutputStream(new FileOutputStream("human.dat"))) {
            Humanity.Human f = new Humanity.Human("Sara", 25);
            ser.writeObject(f);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static class Human implements Serializable {
        private final String name;
        private final int age;

        Human(String d, int c) {
            name = d;
            age = c;

        }

        String getName() {
            return name;
        }
        int getAge() {
            return age;
        }

    }
}
