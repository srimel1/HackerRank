import org.w3c.dom.ls.LSOutput;

import static java.lang.String.valueOf;

public class PalindromeNumber {
    public static boolean palNumber(int x) {
        boolean pal = false;
        if(x < 0){
            return false;

        }else {

            String s = valueOf(x);
            System.out.println("s: "+s);
            StringBuilder forward = new StringBuilder(s);
            System.out.println("forward: "+forward);
            StringBuilder backward = forward.reverse();
            if (s.contentEquals(backward)) {
                System.out.println("forward: "+forward+" backward: "+backward);
                pal = true;

            }
        }
        return pal;

    }

    public static boolean optimizedPal(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev *= 10;
            rev += x%10;
            x /= 10;

        }
        return x == rev || x == rev/10;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(palNumber(x));
        System.out.println(optimizedPal(x));
    }
}
