import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceExtractor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String keyword = scan.nextLine();
        String text = scan.nextLine();
        Pattern pattern = Pattern.compile("(?<=^|[.?!] ).+? "+keyword+"([?.!]| .*?[?.!])");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
