import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        Set<String> carIn = new HashSet<>();

        while (!"END".equals(command)) {
            String[] input = command.split(", ");
            if ("IN".equals(input[0])) {
                carIn.add(input[1]);
            } else {
                carIn.remove(input[1]);
            }
            command = scan.nextLine();
        }

        if (!carIn.isEmpty()) {
            for (String car : carIn) {
                System.out.println(car);
            }
        } else{
            System.out.println("Parking Lot is Empty");
        }

    }
}
