import java.util.Scanner;


public class SoNTCN {
    static boolean check(int n) {
        if(n < 2)
            return false;
        for(int i = 2 ; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a ");
        a = sc.nextInt();

        System.out.print("Nhập số b: ");
        b = sc.nextInt();

        for(int i = a ; i <= b ; i ++) {
            if(check(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
