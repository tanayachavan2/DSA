import java.util.Scanner;

public class Pat2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // System.out.print("(" + i + ", " + j + ")\t");
                // if (i == j) {
                if (i + j <= n - 1) {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}  

