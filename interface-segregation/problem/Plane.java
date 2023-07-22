package problem;

public class Plane implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Drive !");
    }

    @Override
    public void sail() {
        System.out.println("unneeded");
    }

    @Override
    public void fly() {
        System.out.println("Fly !");
    }
}
