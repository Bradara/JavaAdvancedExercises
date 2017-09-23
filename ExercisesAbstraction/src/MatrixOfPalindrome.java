import java.util.Scanner;

public class MatrixOfPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        String[][] matrix = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = "" + (char) ('a' + i) + (char) ('a' + j + i) + (char) ('a' + i);
            }
        }

        print(matrix);
    }

    private static void print(String[][] matrix) {
        for (String[] strings : matrix) {
            System.out.println(String.join(" ", strings));
        }
    }
}
