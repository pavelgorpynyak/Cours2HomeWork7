import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("abc", "bcd", "cde", "abc", "abc","sss","abc", "bcd"));

    public static void main( String[] args ) {
        lesson1();
        System.out.println();
        lesson2();
        System.out.println();
        lesson3();
        lesson4();

    }

    public static void lesson1() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }
    }

    public static void lesson2() {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.print(num);
                prevNum = num;
            }
        }
    }

    public static void lesson3() {
        Set<String> equalWord = new HashSet<>(words);
        System.out.println(equalWord);
    }

    public static void lesson4() {
        Set<String> equalWord = new HashSet<>(words);
        System.out.println(words.size() - equalWord.size());
    }
}


