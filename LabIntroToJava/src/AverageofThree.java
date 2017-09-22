import java.util.Scanner;

public class AverageofThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        double sum = 0;
        for (int i = 0; i < input.length ; i++) {
                sum += Double.parseDouble(input[i]);
        }

        System.out.printf("%.2f", sum/3);
    }
}
