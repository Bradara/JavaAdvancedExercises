import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ByteParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(scan.nextLine()));
        }

        String input = scan.nextLine();

        while(!input.equals("party over")){
            int[] data = Arrays.stream(input.split("\\s+")).mapToInt(Integer::valueOf).toArray();
            int command = data[0];
            int pos = data[1];
            int mask = 1;

            if (command == -1){
                for (int i = 0; i < nums.size(); i++) {
                    nums.set(i, nums.get(i) ^ (mask<<pos));
                }
            } else if (command == 0){
                for (int i = 0; i < nums.size(); i++) {
                    nums.set(i, nums.get(i) & ~(mask<<pos));
                }
            } else if (command == 1){
                for (int i = 0; i < nums.size(); i++) {
                    nums.set(i, nums.get(i) | (mask << pos));
                }
            }

            input = scan.nextLine();
        }

        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
