import java.util.ArrayList;
import java.util.List;

public class spec {
    public static long isSpecial(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()+1; j++) {
                String newStr = s.substring(i,j);
                if(istrue(newStr))
                    count++;
            }
        }
        return count;
    }
    public static boolean istrue(String s){
            boolean bool = false;
            int count = 0;
            if (s.length() % 2 == 1) {
                StringBuilder sb = new StringBuilder(s);
                int middle = sb.length() / 2;
                s = sb.deleteCharAt(middle).toString();

            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(0)) {
                    count++;
                }
            }
            if (count == 0)
                bool = true;
            return bool;

    }



    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(isSpecial(s));

    }
}
