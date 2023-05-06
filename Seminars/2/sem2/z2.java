public class z2 {
    public static void main(String[] args) {
        String str = "aafffdddwsssshvvvjzz";
        int count = 1;
        strMetZip(str, count);
    }
    private static void strMetZip(String str, int count) {
        StringBuilder strZip = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count += 1;
                if (i == str.length() - 2){
                    strZip.append(str.charAt(i));
                    strZip.append(count);
                }
            }
            else if (count == 1) {
                strZip.append(str.charAt(i));
                count = 1;
            }
            else {
                strZip.append(str.charAt(i));
                strZip.append(count);
                count = 1;
            }
        }
        System.out.println(strZip);        
    }
}