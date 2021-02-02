import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spe {
    static long substrCount(int n, String s) {
        List<Character> charArr = new ArrayList<>();
        List<Long> countArr = new ArrayList<>();
        long totalCount = 0, consecutiveCount = 1;
        for (int i = 1; i < n; i++) {
            System.out.println("i:"+i+": "+s.charAt(i)+" i-1: "+s.charAt(i-1)+" consec: "+consecutiveCount+" chararr: "+ Arrays.asList(charArr.toArray()));
            if (s.charAt(i) == s.charAt(i - 1))
                consecutiveCount++; //same characters in a row
            else {
                charArr.add(s.charAt(i - 1));
                countArr.add(consecutiveCount);
                consecutiveCount = 1;
            }
        }
        charArr.add(s.charAt(n - 1));
        countArr.add(consecutiveCount);
        System.out.println("chararr: " + Arrays.toString(charArr.toArray()));
        System.out.println("countArr: "+Arrays.toString(countArr.toArray()));

        for (int i = 0; i < charArr.size(); i++) {
            totalCount += (countArr.get(i) * (countArr.get(i) + 1)) / 2;
            System.out.println("i: "+i+" totalCount: "+totalCount+" countArr(i): "+countArr.get(i));
            if (countArr.get(i) == 1 && i > 0 && i < charArr.size() - 1 && charArr.get(i - 1) == charArr.get(i + 1)) {
                totalCount += Math.min(countArr.get(i - 1), countArr.get(i + 1));
                //System.out.println("totalCount: "+totalCount+" countArr(i-1): "+countArr.get(i-1));
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
        String s = "aaabba";
        System.out.println(substrCount(s.length(),s));
    }
}
