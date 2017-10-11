import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(", ");
        int result = 0;
        Function<String, Integer> parse = (x) -> Integer.parseInt(x);

        for (String s : input) {
            result += parse.apply(s);
        }

        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + result);
    }
}
