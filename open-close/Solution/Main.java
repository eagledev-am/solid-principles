package Solution;



public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20 , 10);
        Square square = new Square(10);
        // if we want to add new shape , we will only implement calcArea method
        // calc area method will be called in Area Calculator without adding  extra code
        // Circle circle = new Circle(10);

        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.calcArea(rectangle));
        System.out.println(areaCalculator.calcArea(square));
    }
}
