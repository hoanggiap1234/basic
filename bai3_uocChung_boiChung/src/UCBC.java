import java.util.Scanner;

public class UCBC {


    public  int USCLN(int a, int b) {
         if (b == 0) return a;
         return USCLN(b, a % b);
    }

    public  int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }

}
