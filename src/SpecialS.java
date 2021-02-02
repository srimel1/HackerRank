import java.util.Arrays;

//worked and passed time constraints
public class SpecialS {
    static long substrCount(int n, String s) {

        int count = n;

        int inarow = 1;

        int middle = -1;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i-1)) {

                count += inarow;
                inarow++;
                
                if (middle > 0) {

                    if ((middle-inarow) > 0 && s.charAt(middle-inarow) == s.charAt(i)) {
                        count++;
                    } else {

                        middle = -1;
                    }
                }
            } else {

                inarow = 1;

                if (((i-2) >= 0) && s.charAt(i-2) == s.charAt(i)) {
                    count++; // 3-char symmetry is detected

                    middle = i-1;
                } else {
                    middle = -1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(substrCount(s.length(),s));
    }
}

