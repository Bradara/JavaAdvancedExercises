import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Deque<Character> stack = new ArrayDeque<>();
        boolean isSimetric = true;

        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (ch == ')' || ch == '}' || ch == ']') {
                Character lastChar = getReversedBracket(stack);
                if (lastChar != ch) {
                    isSimetric = false;
                    break;
                }
            } else{
                stack.push(ch);
            }
        }

        if (isSimetric) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }

    private static Character getReversedBracket(Deque<Character> stack) {
        Character ch = stack.pop();
        if (ch == '[') {
            return ']';
        } else if (ch == '{') {
            return '}';
        } else if(ch == '('){
            return ')';
        } else {
            return ' ';
        }
    }
}
