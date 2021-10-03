public class Main {
    public static boolean ktstn(int n) {
        boolean check = false;
        String s = String.valueOf(n);
        int length = s.length();
        int dem = 0;
        int end;
        if (s.length() % 2 != 0) {
            end = (s.length() - 1) / 2;
        } else {
            end = s.length() / 2;
        }
        for (int i = 0; i < end; i++) {
            if (s.charAt(i) == s.charAt(length - 1 - i)) {
                dem++;
            } else {
                check = false;
                break;
            }
        }
        if (dem == (int) length / 2) {
            check = true;
        }
        return check;
    }

    public static int tongCacChuSo(int n) {
        String s = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result + Character.getNumericValue(s.charAt(i));
        }
        return result;
    }
    public static boolean check068(int n){
        boolean check0 = false;
        boolean check6 = false;
        boolean check8 = false;
        boolean check = false;
        int dem = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            int valueOfi = Character.getNumericValue(s.charAt(i));
           if(valueOfi == 0){
              check0 = true;
              dem ++;
           } else if ( valueOfi == 6) {
               check6 = true;
               dem ++;
           } else if(valueOfi == 8 ){
               check8 = true;
               dem ++;
           } else {
               check = false;
               break;
           }
        }
        if( dem == s.length() && check0 && check6 && check8){
            check = true;
        }
        return  check;
    }

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        String s3 = "";

        for( int i = 1000000 ; i< 1000000000 ; i ++){
            if(ktstn(i)){
                s1 = s1 + " ; " + i;
                if( check068(i)){
                    s2 = s2 + " ; " + i;
                }
                if(tongCacChuSo(i) % 10 == 0){
                    s3 = s3 + " ; " + i;
                }

            }
        }

        System.out.println("a, Cac so thuan nghich co 7 -> 9 chu so la: " + s1);
        System.out.println("b, Cac so thuan nghich co 7 -> 9 chu so va chi co 0,6,8 la: " + s2);
        System.out.println("c, Cac so thuan nghich co 7 -> 9 chu so va tong cac chu so chia het cho 10 la: " + s3);
    }
}
