package Rectangle;
public class main {
    public static void main(String [] args)
    {
        rectangle rect1 = new rectangle(0, 10, 12, 50);
        rect1.printArea();

        rectangle rect2 = new rectangle(0, 10, 120, 50);
        rect2.printArea();

        double per1 = rect1.calcPerimeter();
        System.out.println("Perimeter : "+rect2.calcPerimeter());
    }
}
