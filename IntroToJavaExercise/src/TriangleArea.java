import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        double area = Math.abs(x1*(y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;

        System.out.printf("%d", Math.round(area));
    }
}
