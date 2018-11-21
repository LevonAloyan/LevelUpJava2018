package armen.figure;

/**
 * Created by Amalia on 28.10.2018.
 */
public abstract class Shape {

    protected double width;
    protected double height;

    public Shape(double width){
        this.width = width;
    }
    public Shape(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Shape(){}

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract void draw();
}
