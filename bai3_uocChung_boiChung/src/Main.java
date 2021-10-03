import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        UCBC ucbc = new UCBC();
        int UCLN;
        int BCNN;
        UCLN = ucbc.USCLN(a, b);
        System.out.println("Ước chung lớn Nhất của "+ a + " , " +  b + " và: " + UCLN);

        BCNN = ucbc.BSCNN(a,b);
        System.out.println("Bội chung Nhỏ Nhất của "+ a + " , " +  b + " và: " + BCNN);
    }
}
