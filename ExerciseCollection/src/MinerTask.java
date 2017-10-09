import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class MinerTask {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        int count = 0;
        Map<String, Long> resources = new LinkedHashMap<>();
        String res = "";

        while (!"stop".equals(input)) {
            count++;
            if (count%2 == 1) {
                res = input;
            } else{
                if (resources.containsKey(res)) {
                    resources.put(res, resources.get(res) + Long.parseLong(input));
                } else{
                    resources.put(res, Long.parseLong(input));
                }
            }

            input = bf.readLine();
        }

        resources.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));
    }
}
