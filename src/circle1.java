
/**
 * Created by kaito on 17/6/16.
 */
public class circle1 {

    double radius;

    circle1() {

        radius = 1.0;

    }

    circle1(double newRadius) {

        radius = newRadius;

    }

    public double getArea() {

        return radius * radius * Math.PI;

    }
}
