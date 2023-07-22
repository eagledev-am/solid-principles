package problem;

public class Boat implements Vehicle{
    @Override
    public void drive() {
        System.out.println("unneeded");
    }

    @Override
    public void sail() {
        System.out.println("Sail !");
    }

    @Override
    public void fly() {
        System.out.println("unneeded");
    }
}
