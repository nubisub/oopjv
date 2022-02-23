public class testaccount {
    public static void main(String[] args){
        Account a1 = new Account(1, "Pam");
        Account a2 = new Account(2, "Jim", 1200);
        System.out.println(a1);
        System.out.println(a2);

        a1.credit(1000);
        a2.debit(500);
        System.out.println(a1);
        System.out.println(a2);

        a1.transfer(a2, 50);
        System.out.println(a1);
        System.out.println(a2);
    }
}
