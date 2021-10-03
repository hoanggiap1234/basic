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
    public static void main(String[] args) {
            for( int i = 100000 ;i < 1000000; i ++ ){
                if( i%2 !=0 && KTSNT(i)){
                    System.out.println(i + ", ");
                }
            }
    }
}
