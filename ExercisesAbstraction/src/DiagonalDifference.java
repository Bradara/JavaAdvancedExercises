import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[n][n];
        int primDiag = 0;
        int secDiag = 0;

        for (int i = 0; i < n ; i++) {
            String[] input = scan.nextLine().split("\\s+");
            for (int j = 0; j < n; j++) {
               matrix[i][j] = Integer.parseInt(input[j]);

                if (i == j) {
                    primDiag += matrix[i][j];
                }
                if (i == n - 1 - j) {
                    secDiag += matrix[i][j];
                }
            }
        }

        System.out.println(Math.abs(secDiag - primDiag));

    }
}
