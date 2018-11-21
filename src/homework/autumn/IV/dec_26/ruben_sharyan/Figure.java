package homework.autumn.IV.dec_26.ruben_sharyan;

import java.awt.*;

public abstract class Figure implements Runnable {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    /** Speed of this Figure by x coordinate */
    private int dX;
    /** Speed of this Figure by y coordinate */
    private int dY;

    private Thread t;
    private FigureCanvas figureCanvas;

    private boolean isRunning;

    public Figure(int x, int y, int width, int height) {
        this(x, y, width, height, Color.BLUE);
    }

    public Figure(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move(int dX, int dY) {
        this.x += dX;
        this.y += dY;
    }

    public abstract void draw(Graphics g);
    public abstract boolean isBelong(int x, int y);

    @Override
    public void run() {
        while (isRunning) {
            try {

                move(dX,dY);
                Thread.sleep(25);
                if (getX() == 390){
                    dX = -1;
                }
                if(getY() == 270){
                    dY = -1;
                }
                if (getX() == 0){
                    dX = 1;
                }
                if (getY() == 0){
                    dY = 1;
                }

//                figureCanvas.repaint();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
//            if (getX() == 40){
//                isRunning = false;
//            }
        }
        }


    public void start () {
        t = new Thread(this);
//        if (dX == 0 && dY == 0) {
            dX = getX();
            dY = getY();
//        }
        isRunning = true;
        t.start();

    }
    }

