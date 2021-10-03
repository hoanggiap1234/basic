import java.math.BigInteger;

public class Main {
    public  static boolean ktstn(int n){
        boolean check = false;
        String s = String.valueOf(n);
        int length = s.length();
        int dem =0;
        int end ;
        if(s.length() % 2 != 0){
             end = (s.length()-1)/2;
        }else{
            end = s.length()/2 ;
        }
        for( int i = 0 ; i < end; i++  ){
            if(s.charAt(i) == s.charAt(length-1-i)){
                dem++;
            }
            else{
                check = false;
                break;
            }
        }
        if( dem == (int) length/2){
            check = true;
        }
        return check;
    }
    public  static int tongCacChuSo(int n){
        String s = String.valueOf(n);
        int result = 0;
        for( int i = 0 ; i < s.length(); i ++){
            result = result +  Character.getNumericValue(s.charAt(i));
        }
      return result;
    }
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        for( int i = 100000 ; i< 1000000 ; i ++){
            if(ktstn(i) ){
               s1 = s1 + " ; " + i;
               if( tongCacChuSo(i) % 10 == 0){
                   s2 = s2 + " ; " + i;
               }
            }
        }
        System.out.println("a, Cac so thuan nghich co 6 chu so la: " + s1);
        System.out.println("b, Cac so thuan nghich co 6 chu so, va tong cac chu so chi het cho 10 la: " + s2);
    }
}
