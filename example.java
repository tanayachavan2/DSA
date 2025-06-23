public class example {
   
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printArr(arr, 0);
    }

    private static void printArr(int[] arr, int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        printArr(arr,i+1);
        System.out.print(arr[i] + " ");
    }

}

