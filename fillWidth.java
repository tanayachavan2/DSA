import java.util.Scanner;

public class fillWidth {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int width = scn.nextInt();
        int nlb = scn.nextInt();// size if 5 units
        int nsb = scn.nextInt();// size is 1 unit

        boolean result = false;

        // write your code

        int mnlbr = width/5;
        int mnsbr = width%5;
        if (nlb >= mnlbr && nsb > mnsbr) {
            result = true;
        }else if (nlb < mnlbr && (width - nlb*5) <= nsb) {
            result = true;
        }
        System.out.println(result);
    }
 
    
}
