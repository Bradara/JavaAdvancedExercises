import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VehiclePark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<>(Arrays.asList(scan.nextLine().split(" ")));
        String input = scan.nextLine();
        int count = 0;

        while(!input.equals("End of customers!")){
            String[] data = input.split(" ");
            String order = (data[0].charAt(0) + data[2]).toLowerCase();

            if(cars.contains(order)){
                count++;
                cars.remove(order);
                int price = order.charAt(0) * Integer.parseInt(order.substring(1));
                System.out.printf("Yes, sold for %d$%n", price);
            } else{
                System.out.println("No");
            }

            input = scan.nextLine();
        }

        System.out.printf("Vehicles left: %s%n", String.join(", ", cars));
        System.out.printf("Vehicles sold: %d", count);

    }
}
