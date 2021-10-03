import java.util.Scanner;

public class TinhTong {
    private int n;

    private double s;

    public long tinhTongSoChan(){
        System.out.println("a, Tổng các số chẵn < = " + n);
        this.s = 0;
        for(int i =0 ;i <= n ; i++){
            if(i % 2 == 0){
                s = s + i;
            }
        }
        return (long) s;
    }

    public long tinhTongSoLe(){
        System.out.println("a, Tổng các số lẻ < = " + n);
         this.s = 0;
        for(int i =0 ;i <= n ; i++){
            if(i %2 != 0){
                s = s + i;
            }
        }
        return (long) this.s;
    }

    public void nhapSoN(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên: ");
        this.n = scanner.nextInt();
    }

    public double tinhTongThapPhan(){
        System.out.println("b, Tổng các thap phan: 1 + 1/2 + ... + " +"1/"+ n);
        s = 1;
        if( n == 1 ){
            return s;
        } else{
            for(int i =2 ;i <= n ; i++){
                s = s + (double) 1/i;
            }
        }

        return s;
    }

    public void inTong(){
        System.out.println("Tổng: =" + s);
    }
}
