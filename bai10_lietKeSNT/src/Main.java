public class Main {
    public static boolean KTSNT(int a) {
        boolean check = false;
        int dem = 0;
        if (a <= 2) {
            check = true;
        } else {

            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    dem++;
                    break;
                }
            }
            if (dem > 0) {
                check = false;
            } else {
                check = true;
            }
        }

        return check;
    }

    public static boolean checkChuSoNT(int n) {
        String s = String.valueOf(n);
        boolean check = false;
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (KTSNT(Character.getNumericValue(s.charAt(i)))) {
                dem++;
            }
            else {
                check = false;
            }
        }
        if (dem == s.length()) {
            check = true;
        }
        return check;
    }

    public static void main(String[] args) {
        for (int i = 1000000; i < 10000000; i++) {
            if (KTSNT(i)) {
                if(checkChuSoNT(i)){
                    System.out.println(i);
                }
            }
        }

    }
}
