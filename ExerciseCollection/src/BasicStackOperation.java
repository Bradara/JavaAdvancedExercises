import java.util.*;

public class BasicStackOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] params = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> stack = new ArrayDeque<>();
        int numberOfElements = params[0];
        int numsToPop = params[1];
        int number = params[2];

        for (int i = 0; i < numberOfElements; i++) {
            stack.push(nums[i]);
        }

        for (int i = 0; i < numsToPop; i++) {
            stack.pop();
        }

        if (stack.contains(number)) {
            System.out.println(true);
        } else if(!stack.isEmpty()){
            System.out.println(Collections.min(stack));
        } else{
            System.out.println(0);
        }
    }
}
