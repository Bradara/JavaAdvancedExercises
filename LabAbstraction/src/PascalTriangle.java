import java.math.BigInteger;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        BigInteger[][] pascal = new BigInteger[n][];

        for (int i = 0; i < n; i++) {
            pascal[i] = new BigInteger[i+1];
            for (int j = 0; j < i+1; j++) {
                if(j == 0 || j == i){
                    pascal[i][j] = BigInteger.ONE;
                } else{
                    pascal[i][j] = pascal[i-1][j].add(pascal[i-1][j-1]);
                }
            }
        }

        for (BigInteger[] ints : pascal) {
            for (BigInteger anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
