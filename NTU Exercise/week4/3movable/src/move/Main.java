package move;
public class Main {
    public static void main(String[] args) throws Exception {
        // MovablePoint point = new MovablePoint(1, 1, 2, 2);
        // System.out.println(point);
        // point.moveUp();
        // point.moveLeft();
        // System.out.println(point);

        // MovableCircle lingkaran = new MovableCircle(1, 1, 2, 2, 3);
        // System.out.println(lingkaran);
        // lingkaran.moveUp();
        // lingkaran.moveRight();
        // System.out.println(lingkaran);

        MovableRectangle kotak = new MovableRectangle(1, 1, 2, 2, 3, 4);
        System.out.println(kotak);
        kotak.moveUp();
        kotak.moveRight();
        System.out.println(kotak);
    }
}
