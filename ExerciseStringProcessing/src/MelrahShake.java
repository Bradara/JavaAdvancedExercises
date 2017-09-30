import java.util.Scanner;

public class MelrahShake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scan.nextLine());
        StringBuilder pattern = new StringBuilder(scan.nextLine());

        while (true) {
            if ("".equals(pattern.toString())) {
                System.out.println("No shake.");
                break;
            }

            int firstIndex = text.indexOf(pattern.toString());
            int lastIndex = text.lastIndexOf(pattern.toString());

            if (firstIndex == -1 || lastIndex == -1 || lastIndex == firstIndex) {
                System.out.println("No shake.");
                break;
            }

            int len = pattern.length();
            text = text.replace(firstIndex, firstIndex+len, "");
            text  = text.replace(lastIndex - len, lastIndex, "");
            System.out.println("Shaked it.");
            pattern.replace(len/2, len/2+1, "");
        }

        System.out.println(text);
    }
}
