public class Balltest {
    public static void main(String[] args){
        Ball golf = new Ball(0, 0, 10, 1, 1);
        golf.move();
        System.out.println(golf);

        golf.reflectHorizontal();
        golf.move();
        System.out.println(golf);

        golf.reflectVertical();
        golf.move();
        System.out.println(golf);

        golf.setXDelta(3);
        golf.move();
        System.out.println(golf);
        
    }
}
