import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        double sum = 0;

        for (String s : input) {
            int len = s.length();
            double num = Double.parseDouble(s.substring(1, len-1));
            char before = s.charAt(0);
            char after = s.charAt(len-1);

            if (Character.isUpperCase(before)) {
                num /= (int)before -64;
            } else{
                num *= (int)before -96;
            }

            if (Character.isUpperCase(after)) {
                num -= (int)after -64;
            } else{
                num += (int)after -96;
            }

            sum += num;
        }

        System.out.printf("%.2f", sum);
    }
}
