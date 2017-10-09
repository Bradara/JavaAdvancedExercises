import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class TruckTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Deque<long[]> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            long[] station = Arrays.stream(scan.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
            deque.addLast(station);
        }

        long tank = 0;
        boolean tankIsEmpty = true;
        int count=-1;

        while(true) {
            count++;
            tank = 0;
            tankIsEmpty = true;
            long[] station = deque.pop();
            if (station[0] >= station[1]) {
                tank = station[0] - station[1];
                deque.addLast(station);
                tankIsEmpty = false;
                for (int j = 0; j < n; j++) {
                    station = deque.pop();
                    count++;
                    tank += station[0];
                    if (tank < station[1]) {
                        tankIsEmpty = true;
                        break;
                    } else {
                        tank -= station[1];
                    }
                    tank -= station[1];
                }
            } else {
                deque.addLast(station);
            }

            if (!tankIsEmpty) {
                System.out.println(count % n);
                break;
            }
        }
    }
}
