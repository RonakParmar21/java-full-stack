public class Thar extends Vehicle {
    Thar(String brand) {
        super(brand); //parent class constructor
        //
    }

    @Override
    void start() {

    }

    public static void main(String[] args) {
        // Vechicle c=new Vechicle();
        Thar t = new Thar("Thar");
        t.m1();

    }
}
