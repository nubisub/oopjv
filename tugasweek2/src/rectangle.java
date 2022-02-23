public class rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public rectangle() {
        super();
    }
    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getlength() {
        return length;
    }
    public void setlength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width *length;
    }
    public double getperimeter() {
        return 2 * (width + length);
    }
    public String toString() {
        return  "Rectangle[Shape[color = " +getColor()+ ", filled = " +isFilled()+ ", width = " +width+  ", length = " +length+"]";
    }
}
