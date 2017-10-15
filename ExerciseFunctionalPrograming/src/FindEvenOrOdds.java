import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class FindEvenOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        String condition = br.readLine();

        BiFunction<Integer, Integer, List<Integer>> generateList = (s, e) -> {
            List<Integer> arr = new ArrayList<>();
            for (int i = s; i <= e; i++) {
                arr.add(i);
            }
            return arr;
        };

        List<Integer> result = new ArrayList<>();
        switch (condition){
            case "odd":result = generateList.apply(start, end)
                    .stream().filter(n -> n%2 == 1).collect(Collectors.toList());
            break;
            case "even": result = generateList.apply(start, end)
                    .stream().filter(n -> n%2 == 0).collect(Collectors.toList());
            break;
        }

        result.forEach(n -> System.out.print(n + " "));
    }
}
