public class Main {
    public static void main(String[] args) {
        int n = 8545604 ;
        String s = String.valueOf(n);
        long result = 0;
        for( int i = 0 ; i < s.length(); i ++){
            result = result +  Character.getNumericValue(s.charAt(i));
        }
        System.out.println("Tổng các chữ số có trong sô: " + n + " = " + result);
    }
}
