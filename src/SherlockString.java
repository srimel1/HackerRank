import java.util.*;

public class SherlockString {

    static String sherlock(String s) {

        String answer = "";

        Map<Character, Integer> frequencies = new HashMap<>();
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));

        for (char letter : arr) {
            System.out.println(letter);
            if (frequencies.containsKey(letter)) {
                frequencies.put(letter, frequencies.get(letter) + 1);
                System.out.println(frequencies.toString());
            } else {
                frequencies.put(letter, 1);
                System.out.println("Frequencies: "+frequencies.toString());
            }
        }
        System.out.println(frequencies.toString());


        System.out.println("Freq values: "+frequencies.values());
        Set<Integer> st = new HashSet<>();
        st.addAll(frequencies.values());
        System.out.println("st: " + st.toString());

        if (st.size() > 2) {//More than 2 frequencies
            answer = "NO";
            System.out.println("NO");
        } else if (st.size() == 1){
            System.out.println("YES");
        }else {
            int f1 = 0;
            int f2 = 0;
            int f1Count = 0;
            int f2Count = 0;
            int i = 0;
            for (int n : st) {
                if (i == 0) f1 = n;
                else f2 = n;
                i++;
            }

            for (int freq : frequencies.values()) {
                if (freq == f1) {
                    f1Count++;
                    System.out.println("freq: "+freq + " values: " + frequencies.values() + " f1: " + f1 + " count1: " + f1Count);

                }
                if (freq == f2) {

                    f2Count++;
                    System.out.println("freq: "+freq + " values: " + frequencies.values() + " f2: " + f2 + " count2: " + f2Count);



                }
            }

//
            if ((f1 == 1 && f1Count == 1) || (f2 == 1 && f2Count == 1)) {
                answer = "YES";
            }else if ((Math.abs(f1 - f2) == 1) && (f1Count == 1 || f2Count == 1)) {
                answer = "YES";
            } else {
                answer = "NO";
            }


        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "abcdefghhgfedecbaa";
        String s1 = "aabbcd";
        String s2 = "abcdefghhgfedecba";
        String s3 = "aab";
        String s4 = "aabbcd";
        String s5 = "abcdefghhgfedecba";

        System.out.println(sherlock(s));
//        System.out.println(sherlock(s1));
//        System.out.println(sherlock(s2));
//        System.out.println(sherlock(s3));
//        System.out.println(sherlock(s4));
//        System.out.println(sherlock(s5));
    }

}
