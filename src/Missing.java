import java.util.Scanner;
import java.util.StringTokenizer;

public class Missing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("C:\\Users\\Stephanie\\Projects\\HackerRank\\src\\data");
        int N = Integer.parseInt(scanner.nextLine());
        int nullInQ = 0;
        Double prevValue = null;
        for (int i = 0; i < N; i++) {
            try {
                String data = scanner.next();
                StringTokenizer tokenizer = new StringTokenizer(data, "\t");
                String date = tokenizer.nextToken();
                String value = tokenizer.nextToken();
                Double newValue = Double.parseDouble(value);
                if (nullInQ > 0) {
                    if (prevValue == null) {
                        prevValue = newValue;
                    }
                    double deltaValue = (newValue - prevValue) / (nullInQ + 1);
                    for (int j = 0; j < nullInQ; j++) {
                        System.out.println(prevValue + deltaValue * (j + 1));
                    }
                    nullInQ = 0;
                }
                prevValue = newValue;
            } catch (Exception e) {
                nullInQ++;
            }
        }
        for (int j = 0; j < nullInQ; j++) {
            System.out.println(prevValue);
        }
    }
}

