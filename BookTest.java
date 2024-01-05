public class BookTest {
    public static void main(String[] args) {
        BookBorrower b1 = new BookBorrower();
        BookBorrower b2 = new BookBorrower();

        b1.borrowB();
        System.out.println("b1 asked to borrow the book");
        System.out.print("b1 author and title: ");
        System.out.println(b1.getBookInfor());

        b2.borrowB();
        System.out.println("b2 asked to borrow the book");
        System.out.print("b2 author and title: ");
        System.out.println(b2.getBookInfor());

        b1.returnB();
        System.out.println("b1 returned the book");

        b2.borrowB();
        System.out.print("b2 author and title: ");
        System.out.println(b2.getBookInfor());

        System.out.println("END TESTING");

    }
}
