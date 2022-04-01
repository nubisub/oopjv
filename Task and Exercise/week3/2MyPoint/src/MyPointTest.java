public class MyPointTest {
   public static void main(String[] args) {
      MyPoint satu = new MyPoint(4, 3);
      MyPoint dua = new MyPoint(9, 15);

      System.out.println("satu = " + satu);
      System.out.println("dua = " + dua);

      System.out.println("jarak dari satu ke (0,0) = " + satu.distance());
      System.out.println("jarak dari satu ke (14,27) = " + satu.distance(14,27));
      System.out.println("jarak dari satu ke dua("+ dua.getX()+","+dua.getY()+") = "+ satu.distance(dua));
      int[] a= satu.getXY();

      System.out.println(a[0]);
      // System.out.println(a[1]);

   }
}
