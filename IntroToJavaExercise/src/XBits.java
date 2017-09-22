import java.util.Collections;
import java.util.Scanner;

public class XBits {
    private static Integer[][] matrix = new Integer[8][32];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < 8; i++) {
            String num =Integer.toBinaryString(Integer.parseInt(scan.nextLine()));
            num = String.join("", Collections.nCopies(32-num.length(), "0")) + num;
            for (int j = 0; j < 32; j++) {
                matrix[i][j] = Integer.valueOf(Character.toString(num.charAt(j)));
            }
        }

        int count = 0;

        for (int i = 0; i < matrix.length-2; i++) {
            for (int j = 0; j < matrix[i].length-2; j++) {
                if(CheckX(i,j)){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    private static boolean CheckX(int c, int r) {
        int count = 0;
        for (int i = c; i < c+3; i++) {
            for (int j = r; j < r+3; j++) {
                if((count%2 == 0 && matrix[i][j] == 1)||(count%2 == 1 && matrix[i][j] == 0)){
                    count++;
                }else{
                    return false;
                }
            }
        }

        return true;
    }
}
