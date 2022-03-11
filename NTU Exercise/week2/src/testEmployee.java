public class testEmployee {
    public static void main(String[] args){
        Employee satu = new Employee(1, "Andy", "Bernard", 10000);
        Employee dua = new Employee(2, "Rain", "Wilson", 20000);
        System.out.println(satu);
        System.out.println(dua);

        satu.raiseSalary(50);
        dua.raiseSalary(40);
        System.out.println(satu);
        System.out.println(dua);

        satu.getAnnualSalary();
        dua.getAnnualSalary();
        System.out.println(satu);
        System.out.println(dua);
    }
}
