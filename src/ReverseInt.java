public class ReverseInt {


    public static int reverse(int x) {
        int reversed = 0, y = 0;
        while (x != 0) {
            System.out.println("Berfore - x: "+x+" y: "+y+ " reversed: "+reversed);
            y = x % 10;
            System.out.println("reversed before: "+reversed);
            reversed = reversed * 10;
            System.out.println("reversed during: "+reversed);

            reversed = reversed + y;
            System.out.println("reversed after: "+reversed);

            x /= 10;
            System.out.println("After - x: "+x+" y: "+y+ " reversed: "+reversed);

        }

        return reversed;
    }

    public static void main(String[] args) {
        int x = -312;
        System.out.println(reverse(x));
        int y = 1534236469;
        System.out.println(reverseWithOverflow(y));
        //System.out.println(reverseWithOverflow(x));


    }

    public static int reverseWithOverflow(int x) {
        boolean flag = false;
        if (x < 0) {
            flag = true;
            x = -x;
        }
        int digit = 0, rev = 0, prev = 0;
        while(x != 0){
            digit = x%10;
            rev = rev * 10;
            rev += digit;


            //check for overflow
            if((rev-digit)/10 != prev){
                System.out.println("Overflow");
                return 0;
            }
            prev = rev;
            x /= 10;
        }
        return (flag)? - rev : rev;
    }
}
