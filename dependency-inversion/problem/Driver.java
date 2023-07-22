package problem;

public class Driver {
   private Bus bus;

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void drive(){
       bus.move();
   }
}
