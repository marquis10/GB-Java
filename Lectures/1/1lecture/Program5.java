import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        final int val = 3;
        int[] arr = new int[] { 3, 2, 4, 3, 2, 5, 3, 3, 3, 3, 3 };

        System.out.println(Arrays.toString(arr));
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] == val) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = val;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}