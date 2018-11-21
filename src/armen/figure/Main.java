package armen.figure;

/**
 * Created by Amalia on 29.10.2018.
 */
public class Main {
    public static void main(String[] args){

        Shape triangle = new Triangle(15.0, 18.0);
        Shape rectangle = new Rectangle(20.2, 10.0);
        Shape circle = new Circle(20.0);
        triangle.draw();
        rectangle.draw();
        circle.draw();
    }
}
