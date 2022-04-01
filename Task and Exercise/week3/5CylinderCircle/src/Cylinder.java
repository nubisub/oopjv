public class Cylinder{
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }
    public Cylinder(double radius,String color, double height) {
        base = new Circle(radius,color);
        this.height = height;
    }
    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getRadius() {
        return base.getRadius();
    }
    public void setRadius(double radius) {
        base.setRadius(radius);
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return base.getArea()*2 + base.getCircumference()*height;
    }
    public double getVolume() {
        return base.getArea()*height;
    }
    public double getCircumference() {
        return base.getCircumference()*2;
    }
    public String toString() {
        return "Cylinder[base=" + base + ", height=" + height + ",color=" + base.getColor() + "]";
    }
    
}