import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Function;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(", ");
        Function<String, Integer> parse = Integer::parseInt;
        ArrayList<Integer> list = new ArrayList<>();

        for (String s : input) {
            list.add(parse.apply(s));
        }

        list.removeIf(x -> x%2 == 1);
        System.out.println(list.toString().replaceAll("[\\[\\]]", ""));
        list.sort(Integer::compareTo);
        System.out.println(list.toString().replaceAll("[\\[\\]]", ""));


    }
}
