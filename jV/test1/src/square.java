public class square extends rectangle {
    public square() {
        super();
    }
    public square(double side) {
        super(side, side);
    }
    public square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setlength(side);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    @Override
    public void setlength(double length) {
        super.setlength(length);
    }
    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color = " + getColor() + ", width = " + getWidth() + ", length = " + getlength() + "]]";
    }

}
    

