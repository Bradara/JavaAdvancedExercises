import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String secondName = scan.nextLine();

        if(firstName.equals("")){
            firstName = "*****";
        }
        if(secondName.equals("")){
            secondName = "*****";
        }

        System.out.printf("Hello, %s %s!", firstName, secondName);
    }
}
