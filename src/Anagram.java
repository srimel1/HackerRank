package Anagram;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < a.length() ; i++) {
            arr1[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++)
            arr2[b.charAt(i) - 'a']++;

        int times = 0;
        for (int i = 0; i < 26; i++)
            times += Math.abs(arr1[i] - arr2[i]);


        return times;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        char[] ar = a.toCharArray();
        System.out.println(Arrays.toString(ar));

        scanner.close();
    }
}
