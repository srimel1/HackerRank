import java.util.*;

public class Pals {

    public static long pals(int n, String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length() ; j++) {
                boolean ispal = isPal(s.substring(i, j));
                System.out.println("i: "+i+" j: "+j+" sub: "+s.substring(i, j)+" ispal: "+ispal);

                if (ispal) {
                    list.add(s.substring(i,j));

                }
            }

        }
        System.out.println(Arrays.toString(list.toArray()));

        return list.size();
    }

    public static boolean isPal(String s) {
        StringBuilder forward = new StringBuilder(s);
        StringBuilder backward = forward.reverse();
//        System.out.println("forward: "+forward+" backward: "+backward);
        return (backward.toString()).equals(s);
    }

    public static void main(String[] args) {
        String s = "aba";
        String s1 = "aaaa";
        String s2 = "abcbaba";
//        System.out.println(pals(s.length(), s));
//        System.out.println(pals(s1.length(), s1));
//        System.out.println(pals(s2.length(), s2));

        System.out.println(findPals(s2));



    }
//
//    public static long findPals(String s) {
//        Set<String> palindromes = new HashSet<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            palindromes.addAll(findPalindromes(s, i, i+1));
////            System.out.println("findPalindromes: "+findPalindromes(s, i, i + 1));
////            System.out.println(palindromes);
//            palindromes.addAll(findPalindromes(s, i, i));
//            System.out.println("findPalindromes("+s+","+i+","+(i+1)+"): "+findPalindromes(s,i,i+1)+" findPalindromes("+s+","+i+","+(i)+"): "+findPalindromes(s, i, i));
//
////            System.out.println(palindromes);
//
//        }
//
//        return palindromes.size();
//    }
//
//    public static Set<String> findPalindromes(String s, int low, int high) {
//        Set<String> result = new HashSet<>();
//        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
//            result.add(s.substring(low, high + 1));
//            System.out.println("result: "+result+" low: "+low+" high: "+high+ " s.sub: "+ s.substring(low,high));
//            low--;
//            high++;
//        }
//        return result;
//    }


    public static Set<String> findPals(String input) {
        Set<String> palindromes = new HashSet<>();
        List<String> pals = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            palindromes.addAll(findPalindromes(input, i, i + 1));
            System.out.println("i+1: "+findPalindromes(input,i,i+1)+" i: "+findPalindromes(input,i,i+1));
            palindromes.addAll(findPalindromes(input, i, i));
            System.out.println("palindromes: "+palindromes);
        }
        return palindromes;
    }
//    Within the loop above, we expand in both directions to get the set of all palindromes centered at each position. We'll find both even and odd length palindromes by calling the method findPalindromes twice in the loop:

    private static Set<String> findPalindromes(String input, int low, int high) {
        Set<String> result = new HashSet<>();
        while (low >= 0 && high < input.length() && input.charAt(low) == input.charAt(high)) {
            result.add(input.substring(low, high + 1));
            System.out.println(input.substring(low, high+1));
            low--;
            high++;
        }
        return result;
    }



}


