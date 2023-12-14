class Library{
    String[] books;
    int bookNo;

    Library(){
      this.books = new String[100];
      bookNo=0;
    }
    public void addBook(String book){
        this.books[bookNo] = book;
        bookNo++;
        System.out.println( book +" has been added");
    }
    public void showBooks(){
        System.out.println("Available Books Are : ");
        for(String element:this.books){
            if ( element == null){
                continue;
            }
            System.out.println("#"+element);
        }
    }
    public void issueBook(String book){
        for(int i=0;i<books.length;i++){
            if(this.books[i]==book){
                System.out.println("Book has been Issued");
            }
        }
        System.out.println("Requested book is not available");
    }
    void returnBook(String book){
        addBook(book);
    };
}
public class java61librarymnagement {
    public static void main(String[] args) {
    Library clgLibrary = new Library();
    clgLibrary.addBook("Java");
    clgLibrary.addBook("IOT");
    clgLibrary.addBook("Software Modelling and Analysis");
    clgLibrary.showBooks();
    }
}
