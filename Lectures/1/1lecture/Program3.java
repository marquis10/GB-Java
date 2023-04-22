public class Program3 {
    public static void main(String[] args) {
        int[] arr = new int [] {3, 2, 2, 3, 1, 3, 3, 1, 3, 1, 2, 1};
        int val = 3;
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            if (count + 1 < arr.length - count - 1){
                if (arr[i] == val){
                    if (arr[i] == arr[arr.length - count - 1])
                        count += 1;
                    temp = arr[i];
                    arr[i] = arr[arr.length - count - 1];
                    arr[arr.length - count - 1] = temp;
                    count += 1;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
    }
}