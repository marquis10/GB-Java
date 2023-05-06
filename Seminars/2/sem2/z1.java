public class z1 {
    public static void main(String[] args) {
        int N = 12;
        String c1 = "a", c2 = "b";
        strF(N, c1, c2);
    }

    private static void strF(int N, String c1, String c2) {
        StringBuilder strFull = new StringBuilder();
        for (int i = 0; i < N; i+=2) {
            strFull.append(c1+c2);
        }
        System.out.println(strFull);
    }
}