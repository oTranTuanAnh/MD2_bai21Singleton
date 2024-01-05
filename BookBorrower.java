public class BookBorrower {
    private BookSingleton brrowedBook;
    private boolean haveBook = false;
    public void borrowB(){
        brrowedBook = BookSingleton.borrowBook();
        if (brrowedBook == null){
            haveBook = false;
        }else {
            haveBook = true;
        }
    }
    public String getBookInfor(){
        if (haveBook){
            return brrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }
    public void returnB(){
        brrowedBook.returnBook(brrowedBook);
    }
}
