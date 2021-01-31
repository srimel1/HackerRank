import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pal {

    static class Pair {
        char c;
        long cnt;

        public Pair(char c, long cnt) {
            this.c = c;
            this.cnt = cnt;
        }
    }

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long count = 0;
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int j = i + 1;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) j++;
            list.add(new Pair(s.charAt(i), j - i));
            System.out.println(list.get(i));
            i = j - 1;
        }

        for (int i = 0; i < list.size(); i++) {
            Pair pair = list.get(i);
            // e.g. for "aaa" we have (1 + 3) * 3 / 2 = 6 special palindromic strings here for case 1
            count += (1 + pair.cnt) * pair.cnt / 2;
            if (pair.cnt == 1 && i > 0 && i < list.size() - 1) {
                Pair pre = list.get(i - 1);
                Pair next = list.get(i + 1);
                if (pre.c == next.c) {
                    count += Math.min(pre.cnt, next.cnt);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "asasd";
        String s1 = "abcbaba";
        String s2 = "aaaa";
        System.out.println(substrCount(s.length(), s));
        System.out.println(substrCount(s1.length(), s1));
        System.out.println(substrCount(s2.length(), s2));

    }
}
