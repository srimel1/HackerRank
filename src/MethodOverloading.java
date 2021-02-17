public class MethodOverloading {
    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    static int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
    static double add(double a, double b){
        double sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(11,11));
        System.out.println(add(10.1,1.2));

    }

    public static void main(String args) {
        System.out.println("main with string");
    }

    public static void main() {
        System.out.println("main without args");
    }
}
