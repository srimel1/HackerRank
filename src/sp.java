import java.util.ArrayList;
import java.util.Iterator;

//public class sp {
//    static long substrCount(int n, String s) {
//
//        if (n < 1) return 0;
//        if (n == 1) return 1;
//        long count = 0;
//        char prev = s.charAt(0);
//        for (int i = 0; i < s.length(); i++) {
//            //increments count for 1 character
//            count++;
//            // check if the string is a palindrome
//            if (s.charAt(i) != s.charAt(0)) {
//                long currCount = countPalindrome(s, i, s.charAt(0), s.length());
//                count += currCount;
//                // Reset previous char
//                prev = s.charAt(i);
//                System.out.println("currCount: "+currCount+" prev: "+s.charAt(i)+" i: "+i);
//            } else if (i >= 1) {
//                // repeated characters
//                // Go back to previous character to count all repeated chars
//                i--;
//                // Adjust count as previous char and current char is already counted
//                count -= 2;
//                long repeats = countRepeats(s, i, prev, n);
//                System.out.println("repeats: "+repeats);
//                // Add count of possible combinations
//                count += repeats * (repeats + 1) / 2;
//                i += repeats - 1;
//            }
//        }
//        // Add length to the count for each character - one character solution
//        return count;
//    }
//
//    // Count possible palindromes
//    static long countPalindrome(String s, int i, char prev, int n) {
//        long count = 0;
//        // Iterate through to check if the current index is pointing to the middle of palindrome
//        int offset = 1;
//        while ((i - offset >= 0 && i + offset < n) && (s.charAt(i - offset) == prev && s.charAt(i + offset) == prev)) {
//            count++;
//            offset++;
//            System.out.println("count: "+count+" offset: "+offset);
//
//        }
//        return count;
//    }
//
//    // Count repeats and calculate all possible combinations
//    static long countRepeats(String s, int i, char prev, int n) {
//        long repeats = 0;
//        while (i < n && s.charAt(i) == prev) {
//            repeats++;
//            i++;
//            System.out.println("i: "+i+" repeats: "+repeats);
//        }
//        return repeats;
//    }
//
//    public static void main(String[] args) {
//        String s = "aaaa";
//        System.out.println(substrCount(s.length(),s));
//    }
//}
public class sp {
    static class Point {
        public char key;
        public long count;

        public Point(char x, long y) {
            key = x;
            count = y;
        }
    }

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        s = s + " ";
        ArrayList<Point> l = new ArrayList<Point>();
        long count = 1;
        char ch = s.charAt(0);
        for (int i = 1; i <= n; i++) {
            if (ch == s.charAt(i))
                count++;
            else {
                l.add(new Point(ch, count));
                count = 1;
                System.out.println("ch: "+ch+" count: "+count);
                ch = s.charAt(i);
            }
        }
        count = 0;
        if (l.size() >= 3) {
            Iterator<Point> itr = l.iterator();
            Point prev, curr, next;
            curr = (Point) itr.next();
            next = (Point) itr.next();
            count = (curr.count * (curr.count + 1)) / 2;
            for (int i = 1; i < l.size() - 1; i++) {
                prev = curr;
                curr = next;
                next = itr.next();
                count += (curr.count * (curr.count + 1)) / 2;
                if (prev.key == next.key && curr.count == 1)
                    count += Math.min(prev.count, next.count);
            }
            count += (next.count * (next.count + 1)) / 2;
        } else {
            for (Point curr : l) {
                count += (curr.count * (curr.count + 1)) / 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aaaa";
        long count = substrCount(s.length(), s);
        System.out.println(count);
    }
}