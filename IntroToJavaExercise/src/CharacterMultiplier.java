import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        String first = input[0];
        String second = input[1];
        int maxLen = Math.max(first.length(), second.length());
        int minLen = Math.min(first.length(), second.length());
        long sum = 0;

        for (int i = 0; i < minLen ; i++) {
            int n1 = first.charAt(i);
            int n2 = second.charAt(i);
            sum += n1*n2;
        }

        if(maxLen != minLen){
            String longStr = first.length()>second.length()? first:second;

            for (int i = minLen; i < maxLen ; i++) {
                sum += longStr.charAt(i);
            }
        }

        System.out.println(sum);
    }
}
