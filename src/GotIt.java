import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GotIt {
    public static void main(String[] args) throws FileNotFoundException {

        String s = "aasdf";
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(alpha));

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < alpha.length-1; i++) {
            if (alpha[i] != 0) {
                System.out.println(alpha[i]);
                list.add(alpha[i]);

            }
        }

        System.out.println(Arrays.toString(list.toArray()));

        List<String> ls = new ArrayList<>();
        File file = new File("C:\\Users\\Stephanie\\Projects\\HackerRank\\src\\test");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String data = sc.next();
            System.out.println("data: "+data);
            ls.add(data);

        }
        System.out.println(Arrays.toString(ls.toArray()));

        String s3 = "asbsdfa";
        String s4 = s3.replace("a","");
        System.out.println("new: "+s4);
        for (String c :
                ls) {
            System.out.println("C: "+c);
        }
        String asdf = "asdf";
        char[] arr = asdf.toCharArray();
        for (int i = 0; i < ls.size(); i++) {
            char[] ar = ls.get(i).toCharArray();
            System.out.println(Arrays.toString(ar));
        }
        System.out.println(Arrays.toString(arr));
        FileReader fileReader = new FileReader("C:\\Users\\Stephanie\\Projects\\HackerRank\\src\\test");
//        Scanner s = new Scanner(fileReader);
//        List<String> list = new ArrayList<>();
//        while (s.hasNext()) {
//            String data = s.next();
//            list.add(data);
//
//
//        }

//        System.out.println(Arrays.asList(list.toArray()));
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("hi") || list.get(i).equals("bye")) {
//                System.out.println(list.get(i));
//            }
//        }
//        System.out.println(Arrays.toString(list.toArray()));
//        if(list.get(0).equals("hi")){
//            System.out.println(list.get(0));
//            System.out.println("it worked");
//            System.out.println(list.get(0).equals("hi"));

    }

//        for (int i = 0; i < list.size(); i++) {
//
//            if(list.get(i)=="hi"){
//                System.out.println("test:  "+list.get(i));
//            }
//
//        }

}



