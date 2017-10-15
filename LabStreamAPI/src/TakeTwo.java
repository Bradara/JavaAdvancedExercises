import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TakeTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> num = new ArrayList<>();
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i : input) {
            num.add(i);
        }

        num.stream().filter(x -> x>=10 && x<= 20).distinct().limit(2).forEach(x -> System.out.print(x + " "));
    }
}
