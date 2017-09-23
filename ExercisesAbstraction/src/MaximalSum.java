import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] rc = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[rc[0]][rc[1]];

        for (int i = 0; i < matrix.length; i++) {
            int[] input = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = input;
        }

        int maxSum = Integer.MIN_VALUE;
        int maxR = 0;
        int maxC = 0;

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int sum = sum(matrix, i, j);

                if (sum > maxSum) {
                    maxSum = sum;
                    maxR = i;
                    maxC = j;
                }
            }
        }

        System.out.printf("Sum = %d%n", maxSum);
        print3x3(matrix, maxR, maxC);
    }

    private static void print3x3(int[][] matrix, int maxR, int maxC) {
        for (int i = maxR; i < maxR + 3; i++) {
            for (int j = maxC; j < maxC + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int sum(int[][] matrix, int r, int c) {
        int sum = 0;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
}
