package armen.figure;

/**
 * Created by Amalia on 28.10.2018.
 */
public class Rectangle extends Shape {

    public Rectangle(double width, double hight){
        super(width, hight);
    }

    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){

        return width * 2 + height * 2;
    }
    public void draw(){

        System.out.println(getArea());
        System.out.println(getPerimeter());
    }
}
