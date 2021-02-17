public class Exceptions {
    public static void main(String[] args) {
        int[] a= new int[2];
        try{
            System.out.println("Access element three: " + a[2]);
        }catch(Exception e){
            System.out.println("Exception thrown: "+e);

        }finally{
            a[0] = 9;
            System.out.println("First element: " + a[0]);
            System.out.println("completed finally");
        }
    }
}
