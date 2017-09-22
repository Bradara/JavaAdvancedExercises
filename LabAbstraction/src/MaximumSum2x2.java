import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum2x2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[matrixSize[0]][];

        for (int i = 0; i < matrixSize[0]; i++) {
            int[] row = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = row;
        }

        int maxSum = Integer.MIN_VALUE;
        int maxR = 0;
        int maxC = 0;
        int sum = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                sum = matrix[i][j] + matrix[i+1][j] + matrix[i][j+1] + matrix[i+1][j+1];
                if(sum > maxSum){
                    maxSum = sum;
                    maxR = i;
                    maxC = j;
                }
            }
        }

        System.out.printf("%d %d%n", matrix[maxR][maxC],matrix[maxR][maxC+1]);
        System.out.printf("%d %d%n", matrix[maxR+1][maxC],matrix[maxR+1][maxC+1]);
        System.out.println(maxSum);
    }
}
