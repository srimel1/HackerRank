import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sherlock {

    // Complete the isValid function below.
    static String isValid(String s) {
        String answer = "";
        int[] alpha = new int[26];
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;

        //count frequency of letters and store in array
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }
//        System.out.println(Arrays.toString(alpha));

        //remove all zero's that represent non-present characters in our string
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] != 0)
                list.add(alpha[i]);
        }

        System.out.println(Arrays.toString(list.toArray()));


        int diff = 0;

        int sum = Arrays.stream(alpha).sum();

        for (int i = 0; i < list.size() - 1; i++) {

            diff = Math.abs(list.get(i) - list.get(i + 1));
//            System.out.println(i + ": " + list.get(i) + ", " + list.get(i + 1) + " diff: " + diff + " sum: " + sum + " count: "+count) ;

            if (diff > 0) {
                count += diff;
                i++;
            }

        }


        if (count > 1)
            answer = "NO";
        else if(count == 1 && sum%2==1) {
            answer = "YES";
        }
        else{
            answer = "NO";
        }


//        System.out.println(sum);
        return answer;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
