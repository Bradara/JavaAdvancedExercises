import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        int num = Integer.parseInt(input[0]);
        double floatNum = Double.parseDouble(input[1]);
        double floatNum2 = Double.parseDouble(input[2]);

        System.out.printf("|%1$-10X|%2$010d|%3$10.2f|%4$-10.3f|", num, ToSystemX(num, 2), floatNum, floatNum2);
    }

    private static int ToSystemX(int num, int x) {
        String result = "";
        while(num>0){
            result = num % x + result;
            num = num / x;
        }

        if(result.isEmpty()){
            result = "0";
        }

        return Integer.parseInt(result);
    }
}
