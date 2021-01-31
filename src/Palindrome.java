import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

    public static long pals(int n, String s) {
//        List<String> test = new ArrayList<>();
//        test.add("a");
//        System.out.println(test.contains("a"));
//        System.out.println(test.contains("b"));
//        System.out.println(!test.contains("a"));

        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println("s: "+s+" i: "+i+" j: "+j+" substring: "+s.substring(i,j)+" pals: "+list.toString()+" isPal: "+isPalindrome(s.substring(i,j))+" count: "+list.size() + " contains: "+list.contains(s.substring(i,j)));

                if (isPalindrome(s.substring(i, j))) {
                        list.add(s.substring(i, j));
                }
            }
        }
        System.out.println(s+" "+Arrays.toString(list.toArray()));
        return list.size();
    }

    private static boolean isPalindrome(String s) {
        StringBuilder forward = new StringBuilder(s);
//        System.out.println(forward);
        StringBuilder backward = forward.reverse();
        return (backward.toString()).equals(s);
    }

    public static void main(String[] args) {
        String s = "asasd";
        String s1 = "abcbaba";
        String s2 = "aaaa";
        long l = pals(s.length(), s);
        long l1 = pals(s1.length(),s1);
//        System.out.println(l);
        System.out.println(l1);
//        System.out.println(pals(s2.length(), s2));
    }
}
