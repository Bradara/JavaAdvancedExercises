import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();
        String input = scan.nextLine();
        String name = "";
        String phone = "";

        while (!"search".equals(input)) {
            String[] data = input.split("-");
            name = data[0];
            phone = data[1];
            phonebook.put(name, phone);

            input = scan.nextLine();
        }

        input = scan.nextLine();

        while (!"stop".equals(input)) {
            if (phonebook.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, phonebook.get(input));
            } else{
                System.out.printf("Contact %s does not exist.%n", input);
            }

            input = scan.nextLine();
        }
    }
}
