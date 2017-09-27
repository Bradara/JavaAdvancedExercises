import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseTags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputText = scan.nextLine();
        StringBuilder sb = new StringBuilder(inputText);
        Pattern pattern = Pattern.compile("<upcase>(.+?)</upcase>");
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            String match = matcher.group(1);
            int startIndex = sb.indexOf(match);
            sb = sb.replace(startIndex - 8, 9+startIndex +match.length(), match.toUpperCase());
        }

        System.out.println(sb);
    }
}