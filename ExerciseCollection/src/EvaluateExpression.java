import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class EvaluateExpression {
    private static Double result = 0d;
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

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, output.toString().split(" "));

        boolean isFirst = true;

        while (!stack.isEmpty()) {
            String pop = stack.pop();
            if (pop.matches("[+\\-*/]")&& isFirst) {
                isFirst = false;
                Double num1 = Double.parseDouble(stack.pollLast());
                Double num2 = Double.parseDouble(stack.pollLast());
                result += num1;
                calculate(pop, num2);
            } else if (pop.matches("[+\\-*/]")) {
                Double num = Double.parseDouble(stack.pollLast());
                calculate(pop, num);
            } else{
                stack.addLast(pop);
            }
        }

        System.out.printf("%.2f", result);
    }

    private static void calculate(String oper, Double num2) {
        switch (oper){
            case "+":result += num2; break;
            case "-": result = num2 - result; break;
            case "*": result *= num2; break;
            case "/": result = num2 / result; break;
        }
    }
}
