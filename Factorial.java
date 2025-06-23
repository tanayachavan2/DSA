public class Factorial {    
    public static void main(String[] args) {
        int n = 5;
        int res = getFact(n);
        System.out.println(res);
    }

    private static int getFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n  * getFact(n - 1);
    }
}



