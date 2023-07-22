package Problem;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10 , 20);
        Square square = new Square(10);
        // if we want to add new shape
        // we should add condition of shape in calculate Area ( violate ocp )
        // Circle circle = new Circle(10);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println(calculator.calcArea(rectangle));
        System.out.println(calculator.calcArea(square));
    }
}
