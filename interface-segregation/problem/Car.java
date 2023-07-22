package problem;

public class Car implements Vehicle{
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
        System.out.println("unneeded");
    }
}
