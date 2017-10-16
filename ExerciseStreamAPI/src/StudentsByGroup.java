import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.collections.transformation.SortedList;

import java.io.*;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentsByGroup {
    public static class Student{
        String fn;
        String firstName;
        String lastName;
        String email;
        int age;
        int group;
        List<Integer> grades;
        String phone;

        public Student(String fn, String firstName, String lastName, String email, int age, int group, List<Integer> grades, String phone) {
            this.fn = fn;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.age = age;
            this.group = group;
            this.grades = grades;
            this.phone = phone;
        }

        public String getFn() {
            return fn;
        }

        public void setFn(String fn) {
            this.fn = fn;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getGroup() {
            return group;
        }

        public void setGroup(int group) {
            this.group = group;
        }

        public List<Integer> getGrades() {
            return grades;
        }

        public void setGrades(List<Integer> grades) {
            this.grades = grades;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./StudentData.txt"));
        List<Student> students = new ArrayList<>();

        br.readLine();
        String input;

        while ((input = br.readLine()) != null && input.length() > 0) {
            List<String> data = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
            String fn = data.get(0);
            String firstName = data.get(1);
            String lastName = data.get(2);
            String email = data.get(3);
            int age = Integer.parseInt(data.get(4));
            int group = Integer.parseInt(data.get(5));
            List<Integer> grades = new ArrayList<>();
                    data.subList(6, 10).stream().mapToInt(Integer::valueOf).forEach(grades::add);
            String phone = data.get(10);
            Student student = new Student(fn, firstName, lastName, email, age, group, grades, phone);
            students.add(student);
        }

        //P1
//        students.stream().filter(s -> s.group == 2).sorted(Comparator.comparing(a -> a.firstName))
//                .forEach(s -> System.out.println(s.firstName + " " + s.lastName));

        //P2
//        students.stream().filter(s -> s.firstName.compareTo(s.lastName) < 0)
//                .forEach(s -> System.out.println(s.firstName + " "+ s.lastName));

        //P3
//        students.stream().filter(s -> s.age >= 18 && s.age <= 24)
//                .forEach(s -> System.out.println(s.firstName +" " + s.lastName + " " + s.age));

        //P4
//        students.stream().sorted(Comparator.comparing(Student::getLastName)
//                .thenComparing(Comparator.comparing(Student::getFirstName).reversed()))
//                .forEach(s -> System.out.println(s.firstName +" " + s.lastName));

        //P5 Filter By email domains.
//        students.stream().filter(s -> s.email.endsWith("@gmail.com"))
//                .forEach(s -> System.out.println(s.firstName + " " + s.lastName + " " + s.email));

        //P6 Filter by city.
//        students.stream().filter(s -> s.phone.startsWith("02")||s.phone.startsWith("+3592"))
//                .forEach(s -> System.out.println(s.firstName + " " + s.lastName + " " + s.phone));

        //P7 Excellent student
//        students.stream().filter(s -> s.grades.contains(6))
//                .forEach(s -> {
//                    System.out.print(s.firstName +" ");
//                    System.out.print(s.lastName +" ");
//                    s.grades.sort(Comparator.reverseOrder());
//                    for (Integer grade : s.grades) {
//                        System.out.print(grade +" ");
//                    }
//                    System.out.println();
//                });

        //P8 Weak Students.
//        students.stream().filter(s -> s.grades.stream().filter(g -> g <4).toArray().length>=2)
//                .sorted(Comparator.comparing(s->s.grades.stream().reduce(0, (sum, s1) -> sum += s1)))
//                .forEach(s -> {
//                    System.out.print(s.firstName +" ");
//                    System.out.print(s.lastName +" ");
//                    s.grades.sort(Comparator.naturalOrder());
//                    s.grades.forEach(g -> System.out.print(g +" "));
//                    System.out.println();
//                });

        //P9 Students enrolled in 2014 and 2015.
        Map<String, List<Student>> stByGroup = new TreeMap<>();
        for (Student s : students) {
            String year = "20" + s.fn.substring(4);
            stByGroup.putIfAbsent(year, new ArrayList<>());
            stByGroup.get(year).add(s);
        }

        stByGroup.entrySet().forEach((kv) -> {
            System.out.println(kv.getKey() + ":");
            kv.getValue().stream().sorted(Comparator.comparing(a -> a.firstName))
                    .forEach(v -> System.out.println("-- " + v.firstName + " " + v.lastName));
        });
    }
}
