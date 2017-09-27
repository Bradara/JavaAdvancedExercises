import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusRemove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String[]> matrix = new ArrayList<>();
        List<String[]> mirrorMatrix = new ArrayList<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("END")) {
                break;
            }

            String[] row = input.split("");
            matrix.add(row);
            String[] mirrorRow = input.toLowerCase().split("");
            mirrorMatrix.add(mirrorRow);
        }

        checkForPlus(matrix, mirrorMatrix);

        for (String[] str : matrix) {
            for (String s : str) {
                if (s!= " ") {
                    System.out.print(s);
                }
            }
            System.out.println();
        }

    }

    private static void checkForPlus(List<String[]> matrix, List<String[]> mirrorMatrix) {
        for (int i = 0; i < matrix.size() - 2; i++) {
            for (int j = 1; j < matrix.get(i).length; j++) {
                String token = mirrorMatrix.get(i)[j];
                try {
                    if (token.equals(mirrorMatrix.get(i + 1)[j]) && token.equals(mirrorMatrix.get(i + 1)[j - 1])
                            && token.equals(mirrorMatrix.get(i + 1)[j + 1]) && token.equals(mirrorMatrix.get(i + 2)[j])) {
                        removePlus(matrix, i, j);
                    }
                } catch (Exception e) {
                }
            }

        }
    }

    private static void removePlus(List<String[]> matrix, int r, int c) {
        String[] row1 = matrix.get(r);
        row1[c] = " ";
        String[] row2 = matrix.get(r + 1);
        row2[c] = " ";
        row2[c - 1] = " ";
        row2[c + 1] = " ";
        String[] row3 = matrix.get(r + 2);
        row3[c] = " ";
        matrix.set(r, row1);
        matrix.set(r + 1, row2);
        matrix.set(r + 2, row3);
    }
}
