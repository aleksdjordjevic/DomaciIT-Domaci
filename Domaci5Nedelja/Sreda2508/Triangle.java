package Sreda1;

public class Triangle extends Shape {

    private double a, b, c;

    /*Constructor*/

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /*Methods*/
    //Todo:
    @Override
    public double area() {
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double circumference() {
        return (a+b+c);
    }



    @Override
    public String toString() {
        return super.toString();
    }


}
