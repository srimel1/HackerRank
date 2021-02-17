import java.util.Arrays;

public class RomanNumeral {

    public static int romanToInt(String s) {

        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));
        int sum = 0, I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;

        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("i: "+i+ " val: "+arr[i]);
            if (arr[i].equals("I")) {
                sum += 1;
                System.out.println(arr[i]);
            } else if (arr[i].equals("V")) {
                if(arr[i-1].equals("I")){
                    sum+=3;
                }else{
                    sum+=5;
                }
            }
            else if (arr[i].equals("X")){
                if(arr[i-1].equals("I")){
                    sum+=8;
                }else{
                    sum+=10;
                }

            }
            else if (arr[i].equals("L")){
                if(arr[i-1].equals("X")){
                    sum+=40;
                }else{
                    sum+=50;
                }

            }
            else if (arr[i].equals("C")) sum += 100;
            else if (arr[i].equals("D")) sum += 500;
            else if (arr[i].equals("M")) sum += 1000;
        }
        return sum;
    }

    public static void main(String[] args) {
        int x = romanToInt("XL");
        System.out.println(x);

    }
}
