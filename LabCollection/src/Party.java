import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> vipGuests = new LinkedHashSet<>();
        Set<String> guests = new HashSet<>();
        String input = scan.nextLine();

        while (!"PARTY".equals(input)) {
            if (Character.isDigit(input.charAt(0))) {
                vipGuests.add(input);
            } else {
                guests.add(input);
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();

        while (!"END".equals(input)) {
            if (Character.isDigit(input.charAt(0))) {
                if (vipGuests.contains(input))
                vipGuests.remove(input);
            } else if(guests.contains(input)){
                guests.remove(input);
            }
            input = scan.nextLine();
        }

        System.out.println(vipGuests.size() + guests.size());

        for (String vipGuest : vipGuests) {
            System.out.println(vipGuest);
        }
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
