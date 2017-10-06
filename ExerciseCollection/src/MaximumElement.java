import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int[] command = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (command[0] == 1) {
                stack.push(command[1]);
            }
            if (command[0] == 2) {
                stack.pop();
            }
            if (command[0] == 3) {
                System.out.println(Collections.max(stack));
            }
        }
    }
}
