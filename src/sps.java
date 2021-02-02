import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sps {
    public static void main(String[] args) {
        String s = "aaaa";
        String s1 = "aabaa";
        System.out.println(countStr(s1));

    }

    public static long countStr(String s) {
        long count = 0;
        List<String> list = new ArrayList<>();
        String str = null;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {

                String st = s.substring(i, j);
                System.out.println("i,j: " + i + "," + j + " s:" + st);
                if(st.length()%2==1 && st.length()>2){
                    int position = st.length()/2;
                    System.out.println(position);
                    StringBuilder sb = new StringBuilder(st);
                    sb.deleteCharAt(position);
                    System.out.println("sb after delete: "+sb);
                    str = sb.toString();
                }else{
                    str = s;
                }
                boolean special = compare(str);
                if(special == true) count++;

                System.out.println(count);
//
//                if (check(st)) {
//                    list.add(st);
//                    count++;
//                }

            }

        }
        //System.out.println(Arrays.toString(list.toArray()));

        return count;

    }

    public static boolean compare(String s){
        int l = s.length();
        boolean bool = false;
        int count = 0;
        for (int i =1; i < l; i++) {
            if (s.charAt(i) == s.charAt(0)) {
                count++;

            }

        }
        if(count==0) bool = true;
        return bool;
    }

    public static boolean check(String s) {
        boolean special = false;
        long count = 0;
        int position = s.length() / 2;
        if (s.length() > 2 && s.length() % 2 == 1) {
            System.out.println("check s: " + s + " position: " + position);
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(s.length() / 2);
            System.out.println("s: " + s + " sb: " + sb);
            s = sb.toString();


            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(0))
                    count++;
            }


        }
        if (count == 0) special = true;
        return special;
    }

    public static boolean isEq(String s) {
        boolean bool = false;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(0))
                count++;

        }
        if (count == 0) bool = true;

        return bool;
    }
}
