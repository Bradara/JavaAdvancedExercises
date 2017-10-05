import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class PrimePotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        Deque<String> players = new ArrayDeque<>();
        int n = Integer.parseInt(scan.nextLine());
        Collections.addAll(players, input);
        int count = 0;
        int primeCount = 0;

        while (players.size()>1) {
            count++;

            String name = players.pop();
            if (count%n==0) {
                primeCount++;
                if (!isPrime(primeCount)) {
                    System.out.println("Removed " + name);
                } else{
                    System.out.println("Prime " + name);
                    players.addFirst(name);
                }
            } else{
                players.addLast(name);

            }
        }

        System.out.println("Last is " + players.pop());

    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }

        return true;
    }
}
