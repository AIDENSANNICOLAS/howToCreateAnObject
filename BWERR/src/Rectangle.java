public class Rectangle
{
    private int width;
    private int height;


    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */

    //
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }

    //

    //
    public void printArea()  /**Note it will print the area of the Rectangle object that called it using the dot operator!*/
    {
        int area = width * height;
        System.out.println(area);
    }

    //




    //
    public String toString()   /** A toString method returns a String representation of the object.*/
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }

    //

}