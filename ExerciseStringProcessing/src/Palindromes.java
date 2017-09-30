import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("[\\s+,.!?]");
        Set<String> pals = new TreeSet<>();

        for (String s : input) {
            if (!"".equals(s) && (checkPal(s))) {
                pals.add(s);
            }
        }

        System.out.println(pals);
    }

    private static boolean checkPal(String s) {
        int len = s.length();
        for (int i = 0; i < len/2 ; i++) {
            if (s.charAt(i) != s.charAt(len-1-i)) {
                return false;
            }
        }

        return true;
    }
}
