public class z3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("asdasddsadsa");
        int count = 1;
        System.out.println(strPal(str, count));
    }
    private static boolean strPal(StringBuilder str, int count) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                i = str.length();
                return false;
                //System.out.printf("%s - не является палиндромом", str);
            }
            // if (count == str.length() / 2) {
            //     return true;
            //     //System.out.printf("%s - является палиндромом", str);
            // }
            count++;
        }
        return true;
    }
}