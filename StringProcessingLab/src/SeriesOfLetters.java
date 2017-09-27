import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeriesOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder(input);
        Pattern pat = Pattern.compile("(([a-z])\\2+)");
        Matcher matcher = pat.matcher(input);

        while (matcher.find()) {
            String match = matcher.group();
            int index = sb.indexOf(match);
            sb.replace(index, index + match.length(), String.valueOf(match.charAt(0)));
        }

        System.out.println(sb);
    }
}
