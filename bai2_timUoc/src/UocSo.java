import java.util.Scanner;

public class UocSo {
    private int n;
    private String result = "1";

    public  void timUoc(){
        int dem = 2;
        for( int i =2 ; i < n; i++){
            if(n % i == 0){
                result = result + ", " + i;
                dem ++;
            }
        }
        System.out.println(" Các ước số của số " + n + " : " + result + ", " + n);
        System.out.println(" Số ước của sô n = " + n + " là: " + dem);
    }
    public  void  nhapSoN(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên: ");
        n = scanner.nextInt();
    }
}
