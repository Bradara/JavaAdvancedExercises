import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinEvenNumber {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] nums = new double[0];
        try {
            nums = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        } catch (Exception e) {
            //e.printStackTrace();
        }
        double min = Arrays.stream(nums).filter(d -> d%2 == 0).min().isPresent()?
                Arrays.stream(nums).filter(d -> d%2 == 0).min().getAsDouble():
                0.00;
        if (min == 0.00) {
            System.out.println("No match");
        }else{
            System.out.printf("%.2f", min);
        }
    }
}
