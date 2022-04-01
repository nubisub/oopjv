import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit (Customer customer, Date date){
        this.customer = customer;
        this.setDate(date);
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getName(){
        return customer.getName();
    }
    public double getServiceExpense() {
        return serviceExpense;
    }
    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }
    public double getProductExpense() {
        return productExpense;
    }
    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    public double getTotalExpense(){
        return serviceExpense - (serviceExpense*DiscountRate.getServiceDiscountRate(customer.getMemberType()))+ productExpense - (productExpense*DiscountRate.getProductDiscountRate(customer.getMemberType()));
    }
    public String toString(){
        return "Customer: " + customer.getName() + ", Member :" +  customer.getMemberType() + ", Total expense: " + getTotalExpense();
    }
}
