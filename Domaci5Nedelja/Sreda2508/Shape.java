package Sreda1;

public abstract class Shape {
    private String name;

    /*Constructor*/
    // TODO: Implement me

    public Shape(String name) {
        this.name = name;
    }

    /*Methods*/
    public abstract double circumference();

    public abstract double area();

    //Shape: {name}
    //Circumference: {circumference()}
    //Area: {area()}
    //-----------------
    @Override// TODO: Implement me
    public String toString() {
        return "Shape " + name + "\n" +
                "Circumference " + circumference() + "\n" +
                "Area " + area()+ "\n";

    }

}
