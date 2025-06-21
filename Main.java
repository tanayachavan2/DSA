import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int starCount = i + 1; // n - i 
            // System.out.println("no of stars: " + starCount);
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scn.close();
    }
}