import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] matrixSize =Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[matrixSize[0]][];
        int sum = 0;

        for (int i = 0; i < matrixSize[0]; i++) {
            int[] row = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = row;
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }

        System.out.println(matrixSize[0]);
        System.out.println(matrixSize[1]);
        System.out.println(sum);

    }
}
