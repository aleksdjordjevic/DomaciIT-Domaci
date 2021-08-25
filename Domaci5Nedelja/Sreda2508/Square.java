package Sreda1;


public class Square extends Shape{
    private double a;
    private double b;

    /*Constructor*/

    public Square(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    /*Methods*/
    @Override
    public double area() {


        return a*a;
    }
    @Override
    public double circumference() {
        return (4*a);
    }
    //TODO



    @Override
    public String toString() {
        return super.toString();
    }


}
