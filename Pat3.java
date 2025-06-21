
import java.util.Scanner;

public class Pat3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // this will always be a odd number

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n/2 || j == n/2) {
                    System.out.print("* ");
                }else{
                    if (i == 0 && j > n/2) {
                        System.out.print("* ");
                    } else if(i == n - 1 && j < n/2){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();
        }
    }
}

    
