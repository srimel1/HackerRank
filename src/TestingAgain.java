import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestingAgain {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("C:\\Users\\Stephanie\\Projects\\HackerRank\\src\\test");
        Scanner s = new Scanner(fileReader);
        int[] arr = new int[26];
        List<String> list = new ArrayList<>();
        int count = 0;


        while (s.hasNext()) {
            String data = s.next();
            System.out.println(data);
            list.add(data);

        }
        System.out.println(Arrays.toString(list.toArray()));

        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i);
            count += a.length();
            System.out.println("Length: "+a.length()+ " a: "+a);
            for (int j = 0; j < a.length(); j++) {

                System.out.println(j+": "+a.charAt(j));
                arr[a.charAt(j)-'a']++;
            }



        }
        System.out.println("count: "+count+" array: "+Arrays.toString(arr));
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("hi")){
//                System.out.println(list.get(i));
//            }
//        }

    }
}
