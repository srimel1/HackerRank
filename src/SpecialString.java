import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialString {

    public static long isSpecial(String s) {
        List<String> list = new ArrayList<>();
        boolean spec = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String sub = s.substring(i, j);
//                System.out.println("substring: "+sub + " isspecial: " + special(sub));

                if (isspec(sub)) {
                    list.add(sub);
                }


            }
        }


        System.out.println(Arrays.toString(list.toArray()));
        return list.size();
    }

    public static boolean special(String s) {
        boolean special = false;
        int count = 0;
        int j = s.length()-1;


        if(s.length()==1)
            special = true;
        else{
            for (int i = 0; i < j; i++, j--) {
                if(s.charAt(i) == s.charAt(j) ) {
                    special = i <= 0 || s.charAt(i) == s.charAt(i - 1);

                }else
                    count++;
//                System.out.println("("+i+","+j+")= "+s.charAt(i)+", "+s.charAt(j));

//                System.out.println(s+" ("+i+","+j+")= "+s.charAt(i)+","+s.charAt(j)+" special: "+special+" length: "+s.length()+" count: "+count);

            }

        }
        if (count > 0) {
            special = false;
        }




        return special;
    }

    public static boolean isspec(String s){
        List<String> list = new ArrayList<>();
        int length = s.length();
        boolean spec = false;
        int count = 0;
        System.out.println("length: "+length);
        if (length % 2 == 0) {
            for (int i = 0; i < length-1; i++) {
                if(s.charAt(i)!=s.charAt(0)){
                    count++;

                }
                if (count == 0) {
                    System.out.println("count: "+count);
                    spec = true;
                }

            }
        }


        return spec;
    }


    public static void main(String[] args) {
        String s = "abcbaba";
        String s1 = "aaaa";
        System.out.println(isspec(s1));
        System.out.println(isSpecial(s));
        System.out.println(s.charAt(2) == s.charAt(4));//        System.out.println(isSpecial(s1));
    }
}
