package Problem;

public class Eagle implements Animal{

    @Override
    public void fly() {
        System.out.println("Animal can fly");
    }

    @Override
    public void eat() {
        System.out.println("Animal eat");
    }
}
