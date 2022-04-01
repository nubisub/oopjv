public class Main {
    public static void main(String[] args){
        Animal[] hewan = new Animal[3];
        Dog asu = new Dog("asu");
        hewan[1] = new Cat("moci");
        hewan[2] = new Dog("pelki");
        // hewan[3] = new Dog(asu);
        hewan[1].greets();
        hewan[2].greets();
        asu.greets(asu);
    }
}
