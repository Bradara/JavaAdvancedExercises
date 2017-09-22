import java.util.*;

public class EncryptSortPrintArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfStr = Integer.parseInt(scan.nextLine());

        Integer[]  result = new Integer[numberOfStr];

        for (int i = 0; i < numberOfStr; i++) {
            String name = scan.nextLine();
            result[i] = encrypt(name);
        }

        Arrays.sort(result);
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    private static Integer encrypt(String name) {
        List<Character> vowel = Arrays.asList('o', 'a', 'u', 'i', 'e');
        int points = 0;
        int len = name.length();
        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            if(vowel.contains(Character.toLowerCase(c))){
                points += c * len;
            } else{
                points += c/len;
            }
        }

        return points;
    }
}
