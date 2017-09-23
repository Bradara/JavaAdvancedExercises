import java.util.*;

public class SequenceInMatrix {

    private static List<String> maxSequence = new ArrayList<String>();
    private static List<String> tempSequence = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] rc = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[rc[0]][rc[1]];

        for (int i = 0; i < matrix.length; i++) {
            String[] input = scan.nextLine().split("\\s+");
            matrix[i] = input;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                checkRow(matrix, i, j);
                checkCol(matrix, i, j);
                checkDiag(matrix, i, j);
            }
        }

        System.out.println("" + maxSequence);

    }

    private static void checkDiag(String[][] matrix, int row, int col) {
        String str = matrix[row][col];
        tempSequence.clear();
        tempSequence.add(str);

        for (int i = row + 1, j = col +1; i < matrix.length && j < matrix[row].length; i++, j++) {
            if (str.equals(matrix[i][j])) {
                tempSequence.add(str);
            } else {
                break;
            }
        }

        testMaxSequence();
    }

    private static void checkCol(String[][] matrix, int row, int col) {
        String str = matrix[row][col];
        tempSequence.clear();
        tempSequence.add(str);

        for (int i = row + 1; i < matrix.length; i++) {
            if (str.equals(matrix[i][col])) {
                tempSequence.add(str);
            } else {
                break;
            }
        }

        testMaxSequence();
    }

    private static void checkRow(String[][] matrix, int row, int col) {
        String str = matrix[row][col];
        tempSequence.clear();
        tempSequence.add(str);

        for (int k = col + 1; k < matrix[row].length; k++) {
            if (str.equals(matrix[row][k])) {
                tempSequence.add(str);
            } else {
                break;
            }
        }

        testMaxSequence();
    }

    private static void testMaxSequence() {
        if (maxSequence.size() <= tempSequence.size()) {
            maxSequence.clear();
            Collections.addAll(maxSequence, tempSequence);
        }
    }

}
