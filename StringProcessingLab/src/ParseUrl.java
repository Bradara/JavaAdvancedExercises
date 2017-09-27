import java.util.Scanner;

public class ParseUrl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            String[] input = scan.nextLine().split("://");
            if (input.length > 2||input.length<2) {
                System.out.println("Invalid URL");
                return;
            }
            String protokol = input[0];
            if (!(protokol.equals("http") ||protokol.equals("https")||protokol.equals("ftp"))) {
                System.out.println("Invalid URL");
                return;
            }
            String address = input[1];
            address = address.replaceFirst("/", "://");
            String[] s = address.split("://");
            String server = s[0];
            if (!server.matches("^(www.)?[a-zA-Z]+\\.[-\\w_]+$")) {
                System.out.println("Invalid URL");
                return;
            }
            String resources = s[1];
            if (resources.contains(" ")) {
                System.out.println("Invalid URL");
                return;
            }
            System.out.printf("Protocol = %s%n", protokol);
            System.out.printf("Server = %s%n", server);
            System.out.printf("Resources = %s%n", resources);
        } catch (Exception e) {
            System.out.println("Invalid URL");
        }


    }
}
