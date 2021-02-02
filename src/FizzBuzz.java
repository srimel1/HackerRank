public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        fizzBuzz(n);
    }

    public static void fizzBuzz(int n) {
        // Write your code here
//        System.out.println(n);
//        System.out.println(n%3==0);
        for(int i=1; i<=n; i++){
//            System.out.println("i: "+i);
            if(i%3==0 && i%5 == 0){
                System.out.println("FizzBuzz");

            }else if(i%3==0 && i%5 != 0){
                System.out.println("Fizz");
            }else if(i%3!= 0 && i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }

}

