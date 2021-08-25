package Sreda1;

public class Rectangle extends Shape{

    private double a;
    private double b;



    /*Constructor*/

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    /*Methods*/

    @Override
    public double area() {

        return a*b;
    }

    @Override
    public double circumference() {
        return 2*a+2*b;
    }

    //Shape: {name}
    //Circumference: {circumference()}
    //Area: {area()}
    //-----------------
    @Override
    public String toString() {

        return super.toString();
    }

}
