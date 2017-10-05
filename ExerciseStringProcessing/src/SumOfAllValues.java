import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfAllValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String keyStr = scan.nextLine();
        Double sum = 0D;
        Pattern keyPat = Pattern.compile("^([a-zA-Z_]+)(?=\\d).+(?<=\\d)([a-zA-Z_]+)$");
        Matcher matcher = keyPat.matcher(keyStr);
        String startKey = "";
        String endKey = "";

        while (matcher.find()) {
            startKey = matcher.group(1);
            endKey = matcher.group(2);
        }

        if ("".equals(startKey) || "".equals(endKey)) {
            System.out.println("<p>A key is missing</p>");
            return;
        }

        Pattern textPatt = Pattern.compile(startKey + "(-?\\d+(\\.\\d*)?)" + endKey);
        String text = scan.nextLine();
        matcher = textPatt.matcher(text);
        while (matcher.find()) {
            sum += Double.parseDouble(matcher.group(1));
        }

        if (sum == 0) {
            System.out.printf("<p>The total value is: <em>nothing</em></p>\n", sum);
            return;
        }

        System.out.printf("<p>The total value is: <em>%.2f</em></p>\n", sum);

    }
}
