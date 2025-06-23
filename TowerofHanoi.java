public class TowerofHanoi {
    public static void main(String[] args) {
        int n = 3;
        int t1 = 10;
        int t2 = 20;
        int t3 = 30;

        printSol(n, t1, t2, t3);
    }

    private static void printSol(int n, int t1, int t2, int t3) {
        if (n == 0) {
            return;
        }
        printSol(n - 1, t1, t3, t2);
        System.out.println("Move Disk: " + n + " from [ " + t1 + " to " + t2 + "];");
        printSol(n - 1, t3, t2, t1);
    }
}

