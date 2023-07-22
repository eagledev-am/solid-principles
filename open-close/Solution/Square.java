package Solution;

public class Square extends Shape{
    private double length;

    public double getLength() {
        return length;
    }

    public Square(double length) {
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calcArea() {
        return length * length;
    }
}
