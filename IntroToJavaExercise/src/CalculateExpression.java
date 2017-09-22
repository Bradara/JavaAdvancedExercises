import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);

        double f1 = Math.pow((a*a + b*b)/(a*a - b*b),(a+b+c)/Math.sqrt(c));
        double f2 = Math.pow((a*a + b*b - c*c*c), a-b);
        double diff = Math.abs(Avg(a,b,c) - Avg(f1, f2));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, diff);
    }

    private static double Avg(double... a) {
        double result = 0;
        for (double v : a) {
            result += v;
        }

        return result/a.length;
    }
}
