public class testTime {
    public static void main(String[] args){
        Time satu = new Time(10, 59, 59);
        Time dua = new Time(11, 00, 00);
        System.out.println(satu);
        System.out.println(dua);

        satu.nextSecond();
        dua.previousSecond();

        System.out.println(satu);
        System.out.println(dua);
   
    }
}
