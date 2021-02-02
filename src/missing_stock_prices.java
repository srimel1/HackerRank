import java.util.Scanner;

public class missing_stock_prices {


    public static void main(String[] args) {
        double[] data = getData();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == -1) {
                System.out.println(data[i]);
            }
        }

    }

    private static double[] getData() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        double[] data = new double[length];
        int i = 0;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                if (lineScanner.hasNextDouble()) {
                    double temp = lineScanner.nextDouble();
                    data[i] = temp;
                    i++;
                } else {
                    String word = lineScanner.next();
                    if (word.contains("Missing_")) {
                        data[i] = -1;
                        i++;
                    }
                }
            }
        }
        return data;
    }
}

