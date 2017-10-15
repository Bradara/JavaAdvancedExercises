import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AverageDouble {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] nums = new double[0];
        try {
            nums = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }
        double average = Arrays.stream(nums).average().isPresent()?
                Arrays.stream(nums).average().getAsDouble():
                0.00;

        if (average == 0.00) {
            System.out.println("No match");
            return;
        }
        System.out.printf("%.2f", average);
    }
}
