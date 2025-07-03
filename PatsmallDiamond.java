import java.util.Scanner;

public class PatsmallDiamond {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        n = n/2 + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < (n - i) * 2 - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}


