import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        Deque<String> players = new ArrayDeque<>();
        int n = Integer.parseInt(scan.nextLine());
        Collections.addAll(players, input);
        int count = 0;

        while (players.size()>1) {
            count++;
            String name = players.pop();
            if (count == n) {
                System.out.println("Removed " + name);
                count = 0;
            } else{
                players.addLast(name);
            }
        }

        System.out.println("Last is " + players.pop());

    }
}
