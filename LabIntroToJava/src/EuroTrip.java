import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceInBG = Double.parseDouble(scan.nextLine()) * 1.20d;
        BigDecimal priceInDm = new BigDecimal(priceInBG).multiply(new BigDecimal("4210500000000"));

        System.out.printf("%.2f marks", priceInDm);
    }
}
