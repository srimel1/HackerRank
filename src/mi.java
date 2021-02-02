import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class mi {

    public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        FileReader fileReader = new FileReader("C:\\Users\\Stephanie\\Projects\\HackerRank\\src\\data");

        Scanner sc = new Scanner(fileReader);
        DecimalFormat df = new DecimalFormat("##.00");
        int n = sc.nextInt();


        sc.nextLine();
        int i, k = 0, j = 0;
        double arr[] = new double[n - 20];
        int arr_x[] = new int[n - 20];
        int miss_index[] = new int[20];
        for (i = 0; i < n; i++) {
            String temp[] = sc.nextLine().split("\t");

            if (temp[1].startsWith("Missing")) {
                miss_index[j] = i;
                j++;
            } else {
                arr[k] = Double.parseDouble(temp[1]);
                arr_x[k] = i;
                k++;
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr_x));
        System.out.println(Arrays.toString(miss_index));

        double ansy, ansx, a, b, x0, x1, y0, y1;
        int temp, q1, q2, qq1, qq2;

        for (i = 0; i < 20; i++) {
            if (miss_index[i] < arr_x[0]) {
                System.out.println(i+" miss_index[i]: "+miss_index[i]+" arr_x[0]: "+arr_x[0]);
                x0 = arr_x[0];
                x1 = arr_x[1];
                y0 = arr[0];
                y1 = arr[1];

            } else if (miss_index[i] > arr_x[n - 21]) {
                x0 = arr_x[n - 21];
                x1 = arr_x[n - 22];
                y0 = arr[n - 21];
                y1 = arr[n - 22];


            } else {
                temp = 0;
                while (miss_index[i] > arr_x[temp]) {
                    temp++;
                }
                x0 = arr_x[temp - 1];
                x1 = arr_x[temp];
                y0 = arr[temp - 1];
                y1 = arr[temp];

            }
            a = (y1 - y0) / (x1 - x0);
            b = y0 - a * x0;
            ansx = miss_index[i];
            ansy = a * ansx + b;
            System.out.println(df.format(ansy));
        }

    }
}