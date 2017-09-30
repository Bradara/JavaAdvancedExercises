import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input = scan.nextLine();

        while (!"end".equals(input)) {
            sb.append(input);
            sb.append("\n");
            input = scan.nextLine();
        }

        Pattern pattern = Pattern.compile("^([a-z0-9][a-z0-9_.\\-]*?[a-z0-9]@[a-z][a-z-]+?[a-z](\\.[a-z]{2,})+)(?=\\b)");

        for (String s : sb.toString().split("\\s+")) {
            Matcher matcher = pattern.matcher(s);
            if(matcher.find()) {
                System.out.println(matcher.group(1));
            }
        }
    }
}
