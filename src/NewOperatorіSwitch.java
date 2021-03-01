import java.util.Scanner;

public class NewOperatorіSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Який твій номер класу?");
        int schoolclass = scanner.nextInt();
        switch (schoolclass){
            case 1 :
                System.out.println("Тобі шість років");
                break;
            case 2 :
                System.out.println("Тепер тобісім");
                break;
            case 9 :
                System.out.println("Тобі 14 , ДПА на носі");
                break;
            case 11 :
                System.out.println("Тобі 16 , випускний клас");
                break;
            default:
                System.out.println("Невірно вказаний клас");

        }
    }
}
