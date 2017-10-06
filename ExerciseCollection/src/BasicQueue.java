import java.util.*;

public class BasicQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] command = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] input = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int nElemToAdd = command[0];
        int nElemToDeque = command[1];
        int nElemToFind = command[2];

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < nElemToAdd; i++) {
            queue.addLast(input[i]);
        }

        for (int i = 0; i < nElemToDeque; i++) {
            queue.removeFirst();
        }

        if (queue.contains(nElemToFind)) {
            System.out.println(true);
        } else if(!queue.isEmpty()){
            System.out.println(Collections.min(queue));
        } else {
            System.out.println(0);
        }
    }
}
