import java.util.Scanner;

public class StudentsREsults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // int n = Integer.parseInt(scan.nextLine());

        String[] input = scan.nextLine().split("( - )|(, )");
        String name = input[0];
        double jadv = Double.valueOf(input[1]);
        double jOOP = Double.valueOf(input[2]);
        double advOOP = Double.valueOf(input[3]);
        double average = (jadv + jOOP + advOOP)/3;
        System.out.println(String.format("%-10s|%7s|%7s|%7s|%7s|", "Name",
                "JAdv", "JavaOOP", "AdvOOP", "Average"));
        System.out.println(String.format("%-10s|%7.2f|%7.2f|%7.2f|%7.4f|%n", name, jadv, jOOP, advOOP, average));

    }
}
