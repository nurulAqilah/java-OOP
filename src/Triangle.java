/**
 * Created by kaito on 17/6/16.
 */
public class Triangle {

    double side1 = 1.0,side2 = 1.0,side3 = 1.0;

    Triangle(double newT1, double newT2, double newT3) {

        side1 = newT1;
        side2 = newT2;
        side3 = newT3;

    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
