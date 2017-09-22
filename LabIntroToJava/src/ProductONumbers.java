import java.math.BigInteger;
import java.util.Scanner;

public class ProductONumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        BigInteger product = BigInteger.ONE;

        for (int i = n; i <= m; i++) {
            product = product.multiply(new BigInteger(String.valueOf(i)));
        }

        System.out.printf("product[%s..%s] = %s", n, m, product);
    }
}
