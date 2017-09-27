import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("END")) {
            if (input.matches("^[\\w-_]{3,16}$")) {
                System.out.println("valid");
            } else{
                System.out.println("invalid");
            }

            input = scan.nextLine();
        }
    }
}