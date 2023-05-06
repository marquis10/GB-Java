public class Sem2Program2 {
    public static void main(String[] args) {
        String[] name = { "А", "л", "е", "к", "с", "а", "н", "д", "р" };
        String sk = "АЛЕКСАНДР КУ.";
        System.out.println(sk.toLowerCase()); // александр ку.
        System.out.println(String.join("", name)); // Александр
        System.out.println(String.join("", "А", "л", "е", "к", "с", "а", "н", "д", "р"));    // Александр
        System.out.println(String.join(",", "А", "л", "е", "к", "с", "а", "н", "д", "р")); // А,л,е,к,с,а,н,д,р
    }
}