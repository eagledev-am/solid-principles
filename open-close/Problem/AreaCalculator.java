package Problem;

public class AreaCalculator {
     double calcArea(Shape shape){
        if(shape instanceof Rectangle){
            return ((Rectangle) shape).getWidth() * ((Rectangle) shape).getHeight();
        }
        // else if (shape instanceof Circle)

            return ((Square)shape).getLength() * ((Square)shape).getLength();
    }
}
