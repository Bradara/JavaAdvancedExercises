import java.util.ArrayList;
        import java.util.Scanner;

public class FirstOddEvenEl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        Long[] nums = new Long[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Long.parseLong(input[i]);
        }
        String[] line2 = scan.nextLine().split("\\s+");
        int len = Integer.parseInt(line2[1]);
        String crit = line2[2];
        ArrayList<Long> result = new ArrayList<>();
        int count = 0;

        for (long n: nums) {
            if(count >= len){
                break;
            }
            switch (crit) {
                case "odd":
                    if (n % 2 == 1 || n % 2 == -1) {
                        result.add(n);
                        count++;
                    }
                    break;
                case "even":
                    if (n % 2 == 0) {
                        result.add(n);
                        count++;
                    }
                    break;
            }

        }

        for (Long i : result) {
            System.out.print(i + " ");
        }

    }
}
