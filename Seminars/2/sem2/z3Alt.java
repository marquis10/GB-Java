public class z3Alt {
    static boolean strPal(String str){
        String temp = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(temp);
    }
    public static void main(String[] args) {
        System.out.println(strPal("assddsa"));
    }
}