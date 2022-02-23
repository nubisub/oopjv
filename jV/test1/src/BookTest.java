public class BookTest{
    public static void main(String args[]){
    Author[] authors = new Author[2];
    
    authors[0] = new Author("Ryan", "rysn.com", 'm');
    authors[1] = new Author("Kelly", "kelly.com", 'f');

    Book coba = new Book("Coba", 32.2, authors);

    System.out.println(coba);
  


    }

}