import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MapDistrict {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, ArrayList<Integer>> cities = new HashMap<>();
        List<String> input = Arrays.asList(br.readLine().split("\\s+"));

        for (String s : input) {
            String[] data = s.split(":");
            String city = data[0];
            Integer population = Integer.parseInt(data[1]);
            cities.putIfAbsent(city, new ArrayList<>());
            cities.get(city).add(population);
        }

        int limit = Integer.parseInt(br.readLine());
        cities.entrySet().stream()
                .filter(m -> m.getValue().stream().reduce(0, (sum, a) -> sum += a)>=limit)
                .sorted((a, b) -> Integer.compare(
                        b.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        a.getValue().stream().mapToInt(Integer::valueOf).sum()
                ))
                .forEach(kv -> {
                    System.out.printf("%s: ", kv.getKey());
                    kv.getValue().stream()
                            .sorted(Comparator.reverseOrder())
                            .limit(5)
                            .forEach(s -> System.out.print(s +" "));
                    System.out.println();
                });
    }
}
