/**
 * Created by kaito on 17/6/16.
 */


public class testCircle {

    public static void main(String[] args) {


        circle1 myCircle = new circle1(5.0);

        System.out.println("The area of the circle of radius" + myCircle.radius + " is " + myCircle.getArea());


        circle1 yourCircle = new circle1();

        System.out.println("The area of the circle of radius " + yourCircle.radius + " is " + yourCircle.getArea());

        yourCircle.radius = 100;

        System.out.println("The area of the circle of radius " + yourCircle.radius + " is " + yourCircle.getArea());
    }
}
