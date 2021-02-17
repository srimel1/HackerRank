package Bank;

public class Bank {
    String name;
    float rate;

    public Bank(String name, float rate) {
        this.name = name;
    }

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public static void main(String[] args) {
        ICIC b1 = new ICIC("ICIC Rocky Mountain Bank");
        SBI b2 = new SBI("SBI bank hi");
        AXIS b3 = new AXIS("AXIS bank north");

        System.out.println(b1.getName()+": "+b1.getRate());
        System.out.println(b2.getName()+": "+b2.getRate());
        System.out.println(b3.getName()+": "+b3.getRate());


    }

    static class SBI extends Bank {



        public SBI(String name) {
            super(name);
            this.rate = 8;
        }
    }

    static class AXIS extends Bank {




        public AXIS(String name) {
            super(name);
            this.rate = 7;
        }
    }

    static class ICIC extends Bank {



        public ICIC(String name) {
            super(name);
            this.rate = 9;
        }
    }
}
