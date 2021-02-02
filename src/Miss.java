import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Miss {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader = new FileReader("C:\\Users\\Stephanie\\Projects\\HackerRank\\src\\data");
        Scanner s = new Scanner(fileReader);
        int N = s.nextInt();
        Double[] data = new Double[N];
        System.out.println(N);
        int i = 0;
        while (s.hasNext()) {
            String str = s.nextLine();
            Scanner sc = new Scanner(str);
            System.out.println(str);
            while (sc.hasNext()) {
                if (sc.hasNextDouble()) {
                    double temp = sc.nextDouble();
                    data[i] = temp;
                    i++;
                } else {
                    String word = sc.next();
                    if (word.contains("Missing")) {
                        data[i] = (double) -1;
                        i++;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(data));
    }
}
