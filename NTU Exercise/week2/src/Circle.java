public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        super();
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getperimeter() {
        return 2 * radius * Math.PI;
    }
    public String toString() {
        return  "Circle[Shape[color = " +getColor()+ ", filled = " +isFilled()+ ", radius = " +radius+"]";
    }
    
}
