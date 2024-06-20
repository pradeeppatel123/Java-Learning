class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBookBorrowed;
    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }
    Book(String isbn,String title,String author){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    void borrowBooks(){
        if(isBookBorrowed){
            System.out.println("Book is already Borrowed");
        } else{
            isBookBorrowed = true;
            System.out.println("Enjoy your Book");
        }
    }
    void returnBook(){
        if(isBookBorrowed){
            isBookBorrowed = false;
            System.out.println("Hope you enjoyed ,Please leave a review");
        } else{
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1","Design","Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBooks();
        myBook.borrowBooks();
        designOfThings.borrowBooks();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }

}
