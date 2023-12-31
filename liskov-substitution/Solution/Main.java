package Solution;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        FlyingAnimal eagle = new Eagle();

        isFlyingAnimal(eagle);
        // isFlyingAnimal(lion) error as Lion does not extend FLyingAnimal
    }

    public static void isFlyingAnimal(FlyingAnimal animal){
        animal.fly();
    }
}
