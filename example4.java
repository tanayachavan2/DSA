public class example4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printArr(arr, arr.length - 1);
    }

    private static void printArr(int[] arr, int i) {
        if (i == 0) {
            System.out.print(arr[i] + " ");
            return;
        }
        System.out.print(arr[i] + " ");
        printArr(arr, i - 1);
        System.out.print(arr[i] + " ");
    }
}
