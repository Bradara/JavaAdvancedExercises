import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern patt = Pattern.compile("[aoieyu]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = patt.matcher(input);
        int count = 0;

        while (matcher.find()) {
            count++;
        }

        System.out.println("Vowels: " + count);
    }
}
