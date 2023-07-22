package problem;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();

        driver.setBus(bus);
        driver.drive();
        // if we want driver to drive a car , we should give driver instance of car
        // According to previous any the driver may drive we will add instance to the Driver class
        // solution : we make an abstraction to define any vechile
    }
}
