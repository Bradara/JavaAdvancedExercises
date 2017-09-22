import java.util.Scanner;

public class ModifyABit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();
        Integer pos = scan.nextInt();
        Integer v = scan.nextInt();
        Integer mask = 1;
        Integer result;

        if(v == 1){
            mask = mask << pos;
            result = num | mask;
        } else {
            mask = ~(mask << pos);
            result = num & mask;
        }

        System.out.println(result);
    }
}
