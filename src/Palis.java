import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PalindromeSubStrings{
    public static int findPalindromesInSubString(String input, int j, int k) {
        int count = 0;
        System.out.println("input length: "+input.length());

        for (; j >= 0 && k < input.length(); --j, ++k) {
            if (input.charAt(j) != input.charAt(k)) {
                System.out.println("NOT: j: "+j+" k: "+k+" substring: "+input.substring(j, k+1));
                break;
            }
            System.out.println("1 char: "+input.substring(j,j+1));

            System.out.println("yes: "+input.substring(j, k+1));

            count++;
        }


        return count;
    }

    public static int findAllPalindromeSubstrings(String input) {
        int count = 0;
        for(int i = 0 ; i < input.length() ; ++i) {
            count+= findPalindromesInSubString(input, i-1, i+1);
            count+= findPalindromesInSubString(input, i, i+1);
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "aabbbaa";
        String s = "abcbaba";

        int count = findAllPalindromeSubstrings(str);
        System.out.println("Total palindrome substrings: " + count);
        int count2 = findAllPalindromeSubstrings(s);
        System.out.println("Total: "+count2+" length: "+s.length());

    }
}  