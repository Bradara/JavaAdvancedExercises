import java.util.Collections;
import java.util.Scanner;

public class SumBigNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine().trim();

        if (num1.startsWith("0")) {
            num1 = num1.replaceFirst("^0+", "");
        }

        String num2 = scan.nextLine().trim().replaceFirst("^0+", "");

        if (num2.startsWith("0")) {
            num2 = num2.replaceFirst("0+", "");
        }

        StringBuilder sum = new StringBuilder();
        int inMind = 0;
        int len = num1.length() > num2.length()? num1.length(): num2.length();
        num1 = num1.length() < len ? String.join("", Collections.nCopies(len-num1.length(), "0")) + num1
                : num1;
        num2 = num2.length() < len ? String.join("", Collections.nCopies( len-num2.length(), "0")) + num2
                : num2;

        for (int i = len-1; i >= 0 ; i--) {
            int n = Integer.parseInt(String.valueOf(num1.charAt(i))) + inMind
                    + Integer.parseInt(String.valueOf(num2.charAt(i)));
            sum = sum.insert(0, n%10);
            inMind = n/10;
        }

        if (inMind > 0) {
            sum.insert(0, inMind);
        }

        System.out.println(sum);
    }
}
