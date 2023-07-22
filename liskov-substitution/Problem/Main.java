package Problem;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal eagle = new Eagle();

        isFlyingAnimal(eagle); // we can pass
        isFlyingAnimal(lion); // we can pass but will throw excption ( violate lsp )

    }

    public static void isFlyingAnimal(Animal animal){
        animal.fly();
    }
}
