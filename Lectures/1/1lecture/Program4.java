public class Program4 {
    public static void main(String[] args) {
        int [] arr = new int[]{1,3,3,2,4,3,5,3,3}; //1 2 4 5 3,3,3,3,3
        int val = 3;
        int count = 0;
    
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != val) {
                arr[count++] = arr[i];
            }
        while (count < arr.length)
            arr[count++] = val;
        for (int i : arr) {
            System.out.println(i);
        }
    }
}