import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] rc  = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[rc[0]][rc[1]];

        for (int i = 0; i < matrix.length; i++) {
            String[] input = scan.nextLine().split("\\s+");
            matrix[i] = input;
        }

        String command = scan.nextLine();

        while (!command.equals("END")){
            try{
                String[] coordinates = command.split("\\s+");
                command = coordinates[0];
                if (command.equals("swap")) {
                    swap(matrix, coordinates);
                } else {
                    //System.out.println("Invalid input!");
                    throw new InputMismatchException();
                }
                print(matrix);

            }catch(Exception e){
                System.out.println("Invalid input!");
            }
            

            command = scan.nextLine();
        }
    }

    private static void print(String[][] matrix) {
        for (String[] strings : matrix) {
            System.out.println(String.join(" ", strings));
        }
    }

    private static void swap(String[][] matrix, String[] coordinates) {
        int r1 = Integer.parseInt(coordinates[1]);
        int c1 = Integer.parseInt(coordinates[2]);
        int r2 = Integer.parseInt(coordinates[3]);
        int c2 = Integer.parseInt(coordinates[4]);

        String temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;
    }
}
