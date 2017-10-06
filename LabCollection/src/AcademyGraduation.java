import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, double[]> students = new TreeMap<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double[] score = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            students.put(name, score);
        }

        for (String k : students.keySet()) {
            double[] score = students.get(k);
            double average = 0;
            for (double v : score) {
                average += v;
            }
            average /= score.length;
            System.out.printf("%s is graduated with %s%n", k, String.valueOf(average));
        }

    }
}
