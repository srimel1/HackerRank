package Abstraction;

//abstract class Bike{  // Abstract class
//    abstract void run();  // Abstract method
//}
//class Honda4 extends Bike{
//    void run(){System.out.println("running safely");}
//    public static void main(String args[]){
//        Bike obj = new Honda4();
//        obj.run();
//    }
//}
//


abstract class Bank {
    abstract void getRateOfInterest();
    int id;
    String name;
    float rate;


    public Bank(int id, String name, float rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }

}

class SBI extends Bank {
    public SBI(int id, String name) {
        super(id, name);
        setRate(7);
    }
    void getRateOfInterest(){
        System.out.println("Rate: "+getRate());
    }

}

class PNB extends Bank {

    public PNB(int id, String name) {
        super(id, name);
        setRate(5);
    }

    void getRateOfInterest() {
        System.out.println("Rate: "+getRate());
    }

}

class test {
    public static void main(String[] args) {
        PNB pnb = new PNB(1, "North Bank");
        System.out.println(pnb.getRate());
        SBI sbi = new SBI(2, "South Bank");
        System.out.println(sbi.toString());
        //System.out.println("ROI: "+pnb.getRateOfInterest());
        System.out.println("Abstract method");
        pnb.getRateOfInterest();

    }
}

