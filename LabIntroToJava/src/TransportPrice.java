import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double km = Double.parseDouble(scan.nextLine());
        String time = scan.nextLine();

        if(km < 20){
            if(time.equals("day")){
                System.out.printf("%.2f", (km*0.79 + 0.7));
            } else {
                System.out.printf("%.2f", (km*0.9 + 0.7));
            }
        } else if(km < 100){
            System.out.printf("%.2f", km*0.09);
        } else {
            System.out.printf("%.2f", km* 0.06);
        }
    }
}
