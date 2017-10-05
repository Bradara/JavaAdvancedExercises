import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Deque<Integer> bracketsIndex = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            String ch = input.charAt(i) + "";
            if ("(".equals(ch)) {
                bracketsIndex.push(i);
            }

            if (")".equals(ch)) {
                String brackets = input.substring(bracketsIndex.pop(), i+1);
                System.out.println(brackets);
            }

        }
    }
}
