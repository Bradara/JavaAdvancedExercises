import java.util.Scanner;

public class CountSubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        String patt = scan.nextLine().toLowerCase();
        int index = input.indexOf(patt);
        int countler = 0;

        while (index >= 0){
            countler++;
            index = input.indexOf(patt, index+1);
        }

        System.out.println(countler);
    }
}
