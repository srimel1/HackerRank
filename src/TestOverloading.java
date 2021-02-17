class TestOverloading4{
    public static void main(String[] args){System.out.println("main with String[]");}
    public static void main(String args){System.out.println("main with String");}
    public static void main(){System.out.println("main without args");}
}

class ABC{
    //Overridden method
    public void disp()
    {
        System.out.println("disp() method of parent class");
    }
}
class Demo extends ABC{
    //Overriding method
    public void disp(){
        System.out.println("disp() method of Child class");
    }
    public void newMethod(){
        System.out.println("new method of child class");
    }
    public static void main( String args[]) {

        ABC obj = new ABC();
        obj.disp();
        ABC obj2 = new Demo(); // Covariance with reference types
        obj2.disp();
    }
}