package solution;

public class Plane implements Vortex{
    @Override
    public void drive() {
        System.out.println("drive !");
    }

    @Override
    public void fly() {
        System.out.println("fly !");
    }
}
