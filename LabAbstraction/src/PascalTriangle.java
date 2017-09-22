import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        long[][] pascal = new long[n][];

        for (int i = 0; i < n; i++) {
            pascal[i] = new long[i+1];
            for (int j = 0; j < i+1; j++) {
                if(j == 0 || j == i){
                    pascal[i][j] = 1;
                } else{
                    pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
                }
            }
        }

        for (long[] ints : pascal) {
            for (long anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
