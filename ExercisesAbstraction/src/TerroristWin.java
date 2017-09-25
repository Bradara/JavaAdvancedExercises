import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TerroristWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("\\|.*?\\|");
        Matcher bombs = pattern.matcher(input);

        while (bombs.find()) {
            String bomb = bombs.group();
            int power = calcPower(bomb);
            int index = input.indexOf(bomb);
            int startIndex = index-power < 0? 0: index-power;
            int endIndex = index + bomb.length() + power >= input.length()? input.length(): index + bomb.length() + power;
            String replaceStr = input.substring(startIndex, endIndex);
            input = input.replace(replaceStr, String.join("", Collections.nCopies(replaceStr.length(), ".")));
        }

        System.out.println(input);

    }

    private static int calcPower(String bomb) {
        int sum = 0;
        for (int i = 1; i < bomb.length()-1; i++) {
            sum += bomb.charAt(i);
        }

        return sum%10;
    }
}
