import java.util.Arrays;
import java.util.Scanner;

public class BlurFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int blurAmmount = Integer.parseInt(scan.nextLine());
        int[] matrixSize = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        long[][] matrix = new long[matrixSize[0]][];

        for (int i = 0; i < matrixSize[0]; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
        }

        int[] target = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        blur(matrix, blurAmmount, target);

        for (long[] ints : matrix) {
            System.out.println(String.join(" ", Arrays.stream(ints).mapToObj(String::valueOf).toArray(String[]::new)));
        }
    }

    private static void blur(long[][] matrix, int blurAmmount, int[] target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i <= target[0] + 1 && i >= target[0] - 1
                        && j <= target[1] +1 && j >= target[1]-1){
                    matrix[i][j] += blurAmmount;
                }
            }
        }
    }
}
