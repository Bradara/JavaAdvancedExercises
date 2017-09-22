import java.util.Scanner;

public class OddEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        int len = input.length;
        if(len%2 == 1){
            System.out.println("invalid length");
            return;
        }
        Integer[] inputNum = new Integer[len];

        for (int i = 0; i < len; i++) {
            inputNum[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < len; i+=2) {
            if(inputNum[i]%2 == 0 && inputNum[i+1]%2 == 0){
                System.out.printf("%d, %d -> both are even%n", inputNum[i], inputNum[i+1]);
            } else if(inputNum[i]%2 == 1 && inputNum[i+1]%2 == 1){
                System.out.printf("%d, %d -> both are odd%n", inputNum[i], inputNum[i+1]);
            } else{
                System.out.printf("%d, %d -> different%n", inputNum[i], inputNum[i+1]);
            }
        }
    }
}
