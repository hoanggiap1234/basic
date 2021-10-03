public class Main {
    public static boolean KTSNT(int a){
        boolean check = false;
        int dem=0;
        if( a <= 2){
            check = true;
        }
        else{

            for( int i = 2; i<= Math.sqrt(a); i++){
                if(a % i == 0){
                    dem++;
                    break;
                }
            }
            if( dem > 0){
                check = false;
            }
            else {
                check = true;
            }
        }

        return  check;
    }

    public  static  void timTSNT(int n){
        for( int i = 2; i <= n; i++ ){
            while( n % i == 0 && KTSNT(i)){
                System.out.println(" " +  i);
                System.out.println("n: " + n);
                n = n / i;
            }
        }
    }
    public static void main(String[] args) {
        int n = 31;
        timTSNT(n);
    }
}
