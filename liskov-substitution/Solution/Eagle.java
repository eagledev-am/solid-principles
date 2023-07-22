package Solution;

public class Eagle implements FlyingAnimal{
    @Override
    public void eat() {
        System.out.println("Animal can eat");
    }

    @Override
    public void fly() {
        System.out.println("Animal can fly");
    }
}
