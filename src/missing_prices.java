import java.io.*;
import java.util.*;
public class missing_prices {
    private static void calc(int N, double[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == -1) {
                if(i==0) {
                    System.out.println((2*arr[1])-arr[2]);
                } else if(i==arr.length-1) {
                    System.out.println((2*arr[i-1]) + arr[i-2]);
                } else {
                    System.out.println((arr[i-1]+arr[i+1])/2);
                }
            }
        }
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        FileReader fileReader = new FileReader("C:\\Users\\Stephanie\\Projects\\HackerRank\\src\\data");
        Scanner in = new Scanner(fileReader).useDelimiter("/|\\s|:|\\t");
        int N = in.nextInt();
        double[] input = new double[N];
        for(int i=0;i<N;i++) {

            String month = in.next(); // can be a param
            System.out.println(month);
            String day = in.next(); // can be a param
            String year = in.next();
            String hour = in.next();
            String min = in.next();
            String sec = in.next();
            String record = in.next();
            System.out.println(record);
            if(record.contains("Missing_")) {
                input[i] = -1;
                System.out.println(input[i]);
            } else {
                input[i] = Double.parseDouble(record);
            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        calc(N, input);
    }
}