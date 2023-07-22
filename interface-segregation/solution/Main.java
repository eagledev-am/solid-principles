package solution;



public class Main {
    public static void main(String[] args) {
        Boat boat = new Boat();
        Car car = new Car();
        Plane plane = new Plane();

        System.out.println("----Boat----");
        boat.sail();
        System.out.println("----Car----");
        car.drive();
//        car.sail();
//        car.fly();
        System.out.println("----Plane----");
        plane.drive();
        plane.fly();
//        plane.sail();
    }
}
