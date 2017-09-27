import java.util.Collections;
import java.util.Scanner;

public class SumBigNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();
        StringBuilder sum = new StringBuilder();
        int inMind = 0;
        int len = num1.length() > num2.length()? num1.length(): num2.length();
        String one = "";
        String two = "";
        num1 = num1.length() < len ? String.join("", Collections.nCopies(num1.length() - len, "0")) + num1
                : num1;
        num2 = num2.length() < len ? String.join("", Collections.nCopies(num2.length() - len, "0")) + num2
                : num2;

        for (int i = len-1; i >= 0 ; i--) {
            sum = sum.insert(0, Integer.parseInt(String.valueOf(num1.charAt(i)) + inMind
                    + Integer.parseInt(String.valueOf(num2.charAt(i)))));
        }

        System.out.println(sum);
    }
}
