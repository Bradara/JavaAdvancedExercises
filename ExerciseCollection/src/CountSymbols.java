import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        Map<Character, Integer> counts = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);

            if (counts.containsKey(ch)) {
                counts.put(ch, counts.get(ch) + 1);
            } else{
                counts.put(ch, 1);
            }
        }

        counts.forEach((k,v) -> System.out.printf("%s: %d time/s%n", k, v));
    }
}
