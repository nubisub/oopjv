package move;
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y,int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    public String toString(){
        return "(" + center.x + "," + center.y + "),Speed=(" + center.xSpeed + ", " + center.ySpeed + "),radius = " + radius;
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }
}
