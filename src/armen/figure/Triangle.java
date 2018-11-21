package armen.figure;

import static java.lang.StrictMath.sqrt;

/**
 * Created by Amalia on 28.10.2018.
 */
public class Triangle extends Shape {


    public Triangle(double width, double hight){
        super(width, hight);
    }

    public double getArea() {

        double gip = width * 2 + height * 2;
        if(width * 2 + height * 2 == gip){
            return (width * height) / 2;
        }
        return 2 * ((width * (height / 2)) / 2);
    }

    public double getPerimeter(){

        double gip = width * 2 + height * 2;
        if(width * 2 + height * 2 == gip){
            return width + height + gip;
        }
        return width + 2 * sqrt((width/2) * (width / 2) + height * height);
    }

    public void draw(){
        System.out.println(getArea());
        System.out.println(getPerimeter());
    }
}
