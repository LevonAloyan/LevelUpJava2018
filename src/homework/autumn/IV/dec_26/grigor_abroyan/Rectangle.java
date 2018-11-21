package homework.autumn.IV.dec_26.grigor_abroyan;

import java.awt.*;

public class Rectangle extends auditorium.figure.Figure {

    public Rectangle(int x, int y, int width, int height) {
        this(x, y, width, height, Color.green);
    }

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, null, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {

        return x >= getX() && x <= getX() + getWidth() && y >= getY() && y <= getY() + getHeight();
    }


}
