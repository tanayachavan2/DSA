import java.util.Scanner;

public class ptrip {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        boolean res = false;
        boolean res1 = isRAT(n1, n2, n3);

        if (n1*n1 == n2*n2 + n3*n3) {
            res = true;
        }else if (n2*n2 == n1*n1 + n3*n3) {
            res = true;
        }else if (n3*n3 == n1*n1 + n2*n2) {
            res = true;
        }

        System.out.println(res);
    }

    private static boolean isRAT(int n1, int n2, int n3) {
        return (n1*n1 == n2*n2 + n3*n3) || (n2*n2 == n1*n1 + n3*n3) || (n3*n3 == n2*n2 + n1*n1);
    }
}
