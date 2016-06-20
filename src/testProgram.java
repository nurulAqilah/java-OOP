/**
 * Created by kaito on 17/6/16.
 */
public class testProgram {

    public static void main (String [] args){
        Triangle triangle = new Triangle(4,5,6);

        System.out.println("value for triangle 1 is: " + triangle.getPerimeter());

        Triangle triangle1 = new Triangle(1.5,2.5,3.5);

        System.out.println(triangle1.getPerimeter());

        Employee a = new Employee();


    }
}
