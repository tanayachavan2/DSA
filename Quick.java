public class Quick {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 9, 3, 5, 8};
        display(arr);
        quickSort(arr);
        display(arr);
    }

    private static void quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
    }

    private static void quickSortHelper(int[] arr, int i, int j) {
        if (i == j || arr.length == 0) {
            return;
        }
        if (i < j) {
            int pivot = j;
            int partitionIdx = partition(arr, i, j, pivot);
            quickSortHelper(arr, i, partitionIdx - 1);
            quickSortHelper(arr, partitionIdx + 1, j);
        }
    }

    private static int partition(int[] arr, int i, int j, int pivot) {
        int m = i - 1;
        int pv = arr[pivot];
        for (int n = i; n <= j; n++) {
            if(arr[n] < pv){
                int temp = arr[m + 1];
                arr[m + 1] = arr[n];
                arr[n] = temp;
                m++;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[m + 1];
        arr[m + 1] = temp;
        return m + 1;
    }

    private static void display(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

