package Rectangle;
public class rectangle {
    static double x, y, width, height;

    public rectangle (double xIn, double yIn, double width, double height)
    {
        x = xIn;
        y = yIn;
        this.width = width;
        this.height = height;
    }

    public void printArea()
    {
        System.out.println("Area : "+ width * height);
    }

    public double calcPerimeter()
    {
        double perimeter = width*2 + height*2;
        return perimeter;
    }
}
