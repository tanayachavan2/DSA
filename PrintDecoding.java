import java.util.Scanner;

public class PrintDecoding {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        String res = printDecoding(str);
        System.out.println(res);
    }

    private static String printDecoding(String str) {
        if (str.isEmpty()) {
            return "";
        }
        int pn = (char)(str.charAt(0) - 'A' + 1);
        String res = printDecoding(str.substring(1));
        res = "" + pn + res;
        return res;
    }
}