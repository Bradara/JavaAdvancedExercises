import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BoundedNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] bounds = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(bounds);
        int low = bounds[0];
        int high = bounds[1];

        Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf)
                .filter(n -> n>= low && n<=high)
                .forEach(n -> System.out.printf("%s ", n));
    }
}
