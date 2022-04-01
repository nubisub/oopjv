public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }
        public double getRadius() {
        return radius;
    }
        public void setRadius(double radius) {
        this.radius = radius;
    }
        public double getArea() {
        return Math.PI*radius*radius;
    }
        public double getCircumference() {
        return Math.PI*radius*2;
    }
        public String toString(){
        return "Circle[radius=" + radius + "color=" + color + "]";
    }
}