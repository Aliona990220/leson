public class PrimitiveDataTypes {
    public static void main(String[] args) {
        int myInt = 567;          // цілі числа , 32 біта.
        short myShort = 3367;     // 16 бітів , від -32тис. до 32тис.
        long myLonq = 586747545;   // 64 біта чисел.

        double myDouble = 23.56;     // нецілі числа 64 біти.
        float myFloat = 24.3f;       // нецілі числа 32 біти.

        char с = 'c';                // для символів.
        boolean b = true;            // це логічний тип данних має значення вірно або невірно.

        int numa = 6;
        int numb = 4;
        if(numa > numb){
            System.out.println("перше число більше другого");
        }
        else{
            System.out.println("Перше число меньше другого");
        }

        int i = 0;
        while(i < 9) {               // (...) умова виконання.
            System.out.print(i);     // тіло цикла.
            i++;
        }
        
    }
}