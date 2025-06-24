import java.util.ArrayList;
import java.util.List;

public class PrintEncodings {
    public static void main(String[] args) {
        String num = "2119";
        List<String> res = printEncodings(num);
        System.out.println(res);
    }

    private static List<String> printEncodings(String num) {
        if (num.equals("")) {
            List<String> blist = new ArrayList<>();
            blist.add("");
            return blist;
        }

        List<String> res = new ArrayList<>();

        char pn1 = (char) ('A' + ((int) ((num.charAt(0) - '0')) - 1));
        List<String> rRes1 = printEncodings(num.substring(1));
        for (int i = 0; i < rRes1.size(); i++) {
            rRes1.set(i, ("" + pn1 + rRes1.get(i)));
        }
        res.addAll(rRes1);
        if (num.length() >= 2) {
            char pn2 = (char) ('A' + ((int) ((num.charAt(0) - '0')) * 10) + ((int) ((num.charAt(1) - '0'))) - 1);
            List<String> rRes2 = printEncodings(num.substring(2));
            for (int i = 0; i < rRes2.size(); i++) {
                rRes2.set(i, ("" + pn2 + rRes2.get(i)));
            }
            res.addAll(rRes2);
        }
        
        return res;
    }
}