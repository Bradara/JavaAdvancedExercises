import java.util.Scanner;

public class MatchFullName {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            while (true) {
                String input = scan.nextLine();
                if ("end".equals(input)) {
                    break;
                }

                if (input.matches("^[A-Z][a-z]+\\s[A-Z][a-z]+$")) {
                    System.out.println(input);
                }
            }
        }
    }
}