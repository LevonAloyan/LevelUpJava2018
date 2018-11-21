package auditorium.classintro;


import auditorium.classintro.figureexception.RectangleNegativeBorderException;

public class RectangleTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        try {
            setWidthTest();
        } catch (Exception e){
            //TODO add exception handleing

        }
    }

    public static void  setWidthTest() {
        Rectangle rect = new Rectangle(30 , 10);
        try {
            rect.setWidth(-1);
//TODO: write here  System.err.print to notify that error handling test of setWidth not passed
        } catch (RectangleNegativeBorderException e){
            if(! "width is -1".equals(e.getMessage())){
                System.err.print("Incorrect message of RectangleNegativeBorderException during the test of Rectangle#setWidth method" +
                        "\n excpected :width is -1, but actual message is: "  + e.getMessage());
                return;
            }
        }

    }

}
