import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MemoryTest {
    public static void main(String[] args) throws FileNotFoundException {
        String str = "";
        FileReader file = new FileReader("C:\\Users\\Stephanie\\Projects\\HackerRank\\src\\test");

        Scanner s = new Scanner(file);
        List<String> list = new ArrayList<>();

        while (s.hasNext()) {
            String data = s.next();
            data = data.replace("\n", "").replace("\r", " ");
            System.out.println(data);
            list.add(data);

        }

        int[] alpha = new int[26];
        System.out.println(Arrays.toString(list.toArray()));

        for (int i = 0; i < list.size(); i++) {

        }
//        System.out.println(list.get(0));


    }

//            try {
//        File myObj = new File("C:\\Users\\Stephanie\\Projects\\Interview Prep\\src\\text");
//        Scanner myReader = null;
//        try {
//            myReader = new Scanner(myObj);
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
//        while (myReader.hasNext()) {
//            String data = myReader.nextLine();
//            System.out.println(data);
//            list.add(s.next());
//
//
//        }
//        myReader.close();
//    } catch (FileNotFoundException e) {
//        System.out.println("An error occurred.");
//        e.printStackTrace();
//    }


}
