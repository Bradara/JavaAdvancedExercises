import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class AddVat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Function<String, Double> parse = Double::parseDouble;
        double[] input = Arrays.stream(br.readLine().split(", "))
                .mapToDouble(Double::parseDouble).toArray();
        Function<Double, Double> adddVat = x -> x*1.2;

        StringBuilder output = new StringBuilder();
        output.append("Prices with VAT:").append("\n");

        for (int i = 0; i < input.length; i++) {
            double price = Math.round(adddVat.apply(input[i])*100)/100d;
            output.append(String.format("%.2f%n", price));
        }

        System.out.println(output.toString().replaceAll("\\.", ","));
    }
}
