public class Program2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 0, 1, 1, 1};
        int count = 0;
        System.out.print("Массив arr = ");
        for (int i : arr) {
            System.out.printf(" %d", i);
            if (i == 1) count += 1;
            else count = 0;
        }
        System.out.printf("\nМаксимальное число подряд идущих единиц = %d", count);
    }
}