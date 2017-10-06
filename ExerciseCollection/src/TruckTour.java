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

        for (int i = 0; i < n; i++) {
            long tank = 0;
            boolean tankIsEmpty = true;
            long[] station = deque.pop();
            if (station[0] >= station[1]) {
                tank += station[0] - station[1];
                tankIsEmpty  = false;
                for (int j = 0; j < n-1; j++) {
                    deque.addLast(station);
                    station = deque.pop();
                    tank += station[0];
                    if (tank < station[1]) {
                        tankIsEmpty = true;
                        break;
                    }
                    tank -= station[1];
                }
            } else{
                deque.addLast(station);
            }

            if (!tankIsEmpty){
                System.out.println(i);
                break;
            }
        }


    }
}
