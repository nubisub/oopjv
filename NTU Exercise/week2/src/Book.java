public class Book {
    private String name;
    private Author[] author ;
    private double price;
    private int qty;

    public Book(String name, double price, Author[] author ){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }
    public Book(String name, double price, int qty, Author[] author ){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public Author[] getAuthor() {
        return author;
    }
    public String getAuthorNames() {
        String result = "";
        for (int i = 0; i < author.length; i++) {
            if (i > 0) {
                result += ", ";
            }
            result += author[i].getName();
        }
        return result;
    }
    public String toString(){
        String result = "Book[name=" + name + ",authors = {Author";
        for (int i = 0; i < author.length; i++) {
            if (i > 0) {
                result += ", ";
            }
            result += "[nama = " + author[i].getName() + ", email = " + author[i].getEmail() + ", gender = " + author[i].getGender() + "]";
        }
        result += "}, price = " + price + ", qty = " + qty;
        return result;
    }
}

    

