import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sher {

    public static void main(String[] args) {
        String s = "abcdefghhgfedecbaa";
        String s1 = "aabbcd";
        String s2 = "abcdefghhgfedecba";
        String s3 = "aab";
        String s4 = "aabbcd";
        String s5 = "abcdefghhgfedecba";

        System.out.println(sherlock(s));
        System.out.println(sherlock(s1));
        System.out.println(sherlock(s2));
        System.out.println(sherlock(s3));
        System.out.println(sherlock(s4));
        System.out.println(sherlock(s5));


    }

    static String sherlock(String s) {
        String answer = "";
        int[] alpha = new int[26];
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;

        //count frequency of letters and store in array
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(alpha));

        //remove all zero's that represent non-present characters in our string
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] != 0)
                list.add(alpha[i]);
        }

        System.out.println(Arrays.toString(list.toArray()));


        int diff = 0;

        int sum = Arrays.stream(alpha).sum();

        for (int i = 0; i < list.size() - 1; i++) {

            diff = Math.abs(list.get(i) - list.get(i + 1));
            System.out.println(i + ": " + list.get(i) + ", " + list.get(i + 1) + " diff: " + diff + " sum: " + sum + " count: " + count);

            if (diff > 0) {
                count += diff;
                i++;

            }

        }


        if (count > 1)
            answer = "NO";
        else if (count == 1 && sum % 2 == 1) {
            answer = "YES";
        } else {
            answer = "NO";
        }


        System.out.println(sum);
        return answer;

    }
}

