import java.util.Scanner;

public class CalcTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        double base = Double.parseDouble(input[0]);
        double height = Double.parseDouble(input[1]);
        System.out.printf("Area = %.2f", calcArea(base, height));
    }

    private static double calcArea(double base, double height) {
        return base * height / 2;
    }
}
