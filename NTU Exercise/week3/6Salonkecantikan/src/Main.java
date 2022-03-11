import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John");
        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100);
        visit.setProductExpense(100);
        System.out.println(visit);
        customer.setMember(true);
        customer.setMemberType("silver");
        System.out.println(visit);


        // Visit x = new Visit("Paul Allen", new Date());
        // System.out.println(x.customer.toString());
        // System.out.println("Date = " + x.getDate());

        // x.setServiceExpense(100);
        // x.setProductExpense(100);

        // x.customer.setMember(true);
        // x.customer.setMemberType("premium");
        // System.out.println(x);
    }
}
