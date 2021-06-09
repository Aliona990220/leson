import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Program {
    public static class Programdes {

        public static void main(String[] args) {

            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat")))
            {
                Programser.Person p=(Programser.Person)ois.readObject();
                System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
            }
            catch(Exception ex){

                System.out.println(ex.getMessage());
            }
        }
    }
}
