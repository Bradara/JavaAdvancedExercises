import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Predicate;

public class SortByAge {
    private static class Person{
        int age;
        String name;
        Person(String name, Integer age){
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(", ");
            persons.add(new Person(input[0], Integer.parseInt(input[1])));
        }

        String condition = br.readLine();
        String age = br.readLine();
        String format = br.readLine();
    }
}
