package ra.dev;

public class Circle extends Shape{
    private double radius;

    public Circle(double v) {
        this.radius=1.0;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
      return Math.PI*Math.pow(this.radius,2);
    }
    public double getPerimeter(){
       return Math.PI*2*this.radius;
    }
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

}
