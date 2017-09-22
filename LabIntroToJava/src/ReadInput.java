import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        scan.nextLine();
        String line = scan.nextLine();

        System.out.printf("%s %s %s %d", s1, s2, line, num1 + num2 + num3);
    }
}
