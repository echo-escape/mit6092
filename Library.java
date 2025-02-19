public class Library {
    // Add the missing implementation to this class
    String addressString;
    int bookIndex;
    Book[] books;

    public Library(String address) {
        addressString = address;
        books = new Book[100];
        for (int i = 0; i < 100; i++) { 
            books[i] = new Book("Book" ); 
        }
        bookIndex = 0;
    }

    public void addBook(Book newBook) {
        books[bookIndex] = newBook;
        bookIndex++;
    }

    public static void printOpeningHours() {
        System.out.println(" Libraries are open daily from 9am to 5pm");
    }

    public void printAddress() {
        System.out.println(addressString);
    }

    public void borrowBook(String bookTitleString) {
        int tag = 0;
        for (int i = 0; i < bookIndex; i++) {
            if (books[i].getTitle().equals(bookTitleString)) {
                tag = 1;
                if (books[i].borrowed) {
                    System.out.println("Sorry, this book is already borrowed ");
                    return;
                } else {
                    System.out.println("You have successfully borrowed " + bookTitleString);
                    books[i].rented();
                    return;
                }
            }
        }
        if (tag == 0) {
            System.out.println("Sorry, this book is not in our catalog");
        }
        
    }

    public void printAvailableBooks() {
        int tag = 0;
        for (int i = 0; i < bookIndex; i++) {
            if (!books[i].isBorrowed()) {
                tag = 1;
                System.out.println(books[i].getTitle());
            }
        }
        if (tag == 0) {
            System.out.println(" No book in catalog!");
        }
    }

    public void returnBook(String bookTitleString) {
        for (int i = 0; i < bookIndex; i++) {
            if (books[i].getTitle().equals(bookTitleString)) {
                books[i].returned();
                System.out.println(" You have successfully returned " + bookTitleString);
            }
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 