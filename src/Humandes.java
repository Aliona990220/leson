import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Humandes {
    public static void main(String[] args) {

        try(ObjectInputStream des = new ObjectInputStream(new FileInputStream("human.dat")))
        {
            Humanity.Human f = (Humanity.Human)des.readObject();
            System.out.printf("Name: %s \t Age: %d \n", f.getName(), f.getAge());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
