import java.util.Scanner;

public class ExtractBitFromInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();
        Integer byteAt = scan.nextInt();

        num = num >> byteAt;
        int answer = num & 1;

        System.out.print(answer);
    }
}
