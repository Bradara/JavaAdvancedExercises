import java.util.Scanner;

public class FilltheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String type = input[1];
        int[][] matrix = new int[n][n];

        if(type.equals("A")){
            fillA(matrix);
        } else{
            fillB(matrix);
        }

        print(matrix);
    }

    private static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static void fillB(int[][] matrix) {
        int n = matrix.length;
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = count++;
                }
            } else{
                for (int j = n-1; j >= 0 ; j--) {
                    matrix[j][i] = count++;
                }
            }

        }
    }

    private static void fillA(int[][] matrix) {
        int n = matrix.length;
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = count++;
            }
        }
    }

}
