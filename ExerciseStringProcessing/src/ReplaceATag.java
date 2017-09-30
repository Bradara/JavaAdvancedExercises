import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceATag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("<a.+?href=(['\"].+?['\"])>(.*?)</a>", Pattern.DOTALL);

        while (!"END".equals(input)){
            sb.append(input);
            sb.append("\n");
            input = scan.nextLine();
        }

        Matcher matcher = pattern.matcher(sb);

        while (matcher.find()) {
            String match = matcher.group();
            int index = sb.indexOf(match);
            String link = matcher.group(1);
            String linkName = matcher.group(2);
            String newLink = String.format("[URL href=%s]%s[/URL]", link, linkName);
            sb.replace(index, index +match.length(), newLink);
            matcher = pattern.matcher(sb);
        }

        System.out.println(sb);


    }
}
