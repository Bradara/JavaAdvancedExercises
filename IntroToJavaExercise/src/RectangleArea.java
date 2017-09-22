import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        System.out.printf("%.2f", a*b);
    }
}
