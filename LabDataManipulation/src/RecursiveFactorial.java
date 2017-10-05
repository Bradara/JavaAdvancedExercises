import java.util.Scanner;
public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int factorial = factorial(n);
        System.out.println(factorial);
    }

    private static int factorial(int n) {
        if (n<1) {
            return 1;
        }

        return n * factorial(n-1);

    }
}
