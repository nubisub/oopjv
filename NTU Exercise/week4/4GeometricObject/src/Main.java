public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);

        ResizableCircle resizableCircle = new ResizableCircle(100.0);
        System.out.println(resizableCircle);
        resizableCircle.resize(50);
        System.out.println(resizableCircle);
        System.out.println(resizableCircle.getArea());
    }
}
