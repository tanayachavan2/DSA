public class fibonacci {
   
    public static void main(String[] args) {
        int n = 8;
        int res = getNthFib(n);
        System.out.println(res);
    }

    private static int getNthFib(int n) {
        if (n <= 2) {
            return n - 1;
        }
        return getNthFib(n - 1) + getNthFib(n - 2);
    }
}

