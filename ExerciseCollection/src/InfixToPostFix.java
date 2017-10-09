import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostFix {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] infix = bf.readLine().split(" ");
        StringBuilder output = new StringBuilder();
        Deque<String> operands = new ArrayDeque<>();

        for (String token : infix) {
            if (token.matches("(\\d+)|(\\w+)")) {
                output.append(token).append(" ");
            } else if (token.matches("[+\\-]")) {
                String peek = operands.peek();
                if ("+".equals(peek) || "-".equals(peek)) {
                    output.append(token).append(" ");
                } else {
                    operands.push(token);
                }
            } else if (token.matches("[*/]")) {
                String peek = operands.peek();
                if ("*".equals(peek) || "/".equals(peek)) {
                    output.append(token).append(" ");
                } else {
                    operands.push(token);
                }
            } else if (token.matches("[()]")) {
                if (token.equals("(")) {
                    operands.push("(");
                } else {
                    String pop = operands.pop();
                    while (!pop.equals("(")) {
                        output.append(pop).append(" ");
                        pop = operands.pop();
                    }
                }
            }
        }

        operands.forEach(x -> output.append(x).append(" "));

        System.out.println(output);
    }
}
