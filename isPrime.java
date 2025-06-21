import java.util.Scanner;

public class isPrime {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write your code
        for (int i = 1; i <= n; i++) {
            boolean factCheck = false;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    factCheck = true;
                    break;
                }
            }
            if (!factCheck) {
                System.out.println(i + ", ");
            }
        }

    }
}
