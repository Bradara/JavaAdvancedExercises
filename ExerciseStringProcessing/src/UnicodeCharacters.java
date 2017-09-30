import java.util.Scanner;

public class UnicodeCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            result.append("\\u");
            result.append(String.format("%04x", (int) sb.charAt(i)));
        }

        System.out.println(result);
    }
}
