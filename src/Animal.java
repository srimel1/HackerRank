public interface Animal {
    public void eat();
    public void travel();
}
class Mammal implements Animal{
    @Override
    public void eat(){
        System.out.println("Eats");
    }

    @Override
    public void travel() {
        System.out.println("Travels");
    }

    public int legs(){
        return 0;
    }

    public static void main(String[] args) {
        Mammal dog = new Mammal();
        dog.eat();
        dog.travel();
    }
}
