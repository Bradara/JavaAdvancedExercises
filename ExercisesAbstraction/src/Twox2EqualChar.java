import java.util.Arrays;
import java.util.Scanner;

public class Twox2EqualChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] rc  = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[rc[0]][rc[1]];

        for (int i = 0; i < matrix.length; i++) {
            String[] input = scan.nextLine().split("\\s+");
            matrix[i] = input;
        }

        int counter = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                String token = matrix[i][j];
                if (token.equals(matrix[i+1][j]) && token.equals(matrix[i][j+1]) && token.equals(matrix[i+1][j+1])  ) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
