package auditorium.classintro;


import auditorium.classintro.figureexception.RectangleNegativeBorderException;

public class Rectangle {
    private int width;
    private int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width <= 0) {
            throw new RectangleNegativeBorderException("width is! " + width);
        }
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height <= 0) {
           throw new RectangleNegativeBorderException("height is " + height);
        }
        this.height = height;
    }

    public int getSquare(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
