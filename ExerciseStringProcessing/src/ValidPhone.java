import java.util.Scanner;

public class ValidPhone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            if ("end".equals(input)) {
                break;
            }

            if (input.matches("^\\+359( |-)[0-9]\\1[0-9]{3}\\1[0-9]{4}$")) {
                System.out.println(input);
            }
        }
    }
}
