import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAndSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] str = Arrays.stream(br.readLine().split("\\s+"))
                .filter(s-> s.matches("(\\+|-)?\\d+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (str.length > 0) {
            System.out.println(Arrays.stream(str).reduce(0, (a, b) -> a+=b));
        } else{
            System.out.println("No match");
        }
    }
}
