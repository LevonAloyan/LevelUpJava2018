package armen.figure;

/**
 * Created by Amalia on 28.10.2018.
 */
public class Circle extends Shape {

    public Circle(double diameter){
        super(diameter);
    }

    public double getArea(){
        double p = 3.14;
        return (p / 4) * (2 * width);
    }
    public double getPerimeter(){

        double p = 3.14;
        return 2 * p * (width / 2);
    }
    public void draw(){
        System.out.println(getArea());
        System.out.println(getPerimeter());
    }
}
