import java.util.Scanner;

public class LibraryApp {
    private static final String BOOK_FILE = "books.dat";
    private static final String MEMBER_FILE = "members.dat";

    public static void main(String[] args) {
        Library library = new Library();

        // Load saved data
        Object loadedBooks = DataHandler.loadData(BOOK_FILE);
        Object loadedMembers = DataHandler.loadData(MEMBER_FILE);
        if (loadedBooks != null) library.getBooks().putAll((java.util.Map<String, Book>) loadedBooks);
        if (loadedMembers != null) library.getMembers().putAll((java.util.Map<String, Member>) loadedMembers);

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Search Book");
            System.out.println("4. Register Member");
            System.out.println("5. List Members");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Book ID: ");
                    String id = sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.listBooks();
                    break;

                case 3:
                    System.out.print("Enter keyword: ");
                    String keyword = sc.nextLine();
                    Book found = library.searchBook(keyword);
                    System.out.println(found != null ? found : "No book found.");
                    break;

                case 4:
                    System.out.print("Member ID: ");
                    String memberId = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    library.registerMember(new Member(memberId, name));
                    break;

                case 5:
                    library.listMembers();
                    break;

                case 6:
                    System.out.print("Member ID: ");
                    String mId = sc.nextLine();
                    System.out.print("Book ID: ");
                    String bId = sc.nextLine();
                    System.out.println(library.borrowBook(mId, bId) ? "Book borrowed!" : "Borrow failed.");
                    break;

                case 7:
                    System.out.print("Member ID: ");
                    String mId2 = sc.nextLine();
                    System.out.print("Book ID: ");
                    String bId2 = sc.nextLine();
                    System.out.println(library.returnBook(mId2, bId2) ? "Book returned!" : "Return failed.");
                    break;

                case 0:
                    DataHandler.saveData(library.getBooks(), BOOK_FILE);
                    DataHandler.saveData(library.getMembers(), MEMBER_FILE);
                    System.out.println("Data saved. Goodbye!");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
