import java.util.Collections;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] banList = scan.nextLine().split(", ");
        String input = scan.nextLine();
        int index = 0;

        for (int i = 0; i < banList.length; i++) {
            String banWord = banList[i];
            input = input.replaceAll("" + banWord, String.join("", Collections.nCopies(banWord.length(), "*")));
        }

        System.out.println(input);
    }
}
