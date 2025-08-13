import java.util.*;

public class Library {
    private Map<String, Book> books;
    private Map<String, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    // Book Operations
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public void removeBook(String bookId) {
        books.remove(bookId);
    }

    public void listBooks() {
        books.values().forEach(System.out::println);
    }

    public Book searchBook(String keyword) {
        return books.values().stream()
                .filter(b -> b.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                             b.getAuthor().toLowerCase().contains(keyword.toLowerCase()))
                .findFirst().orElse(null);
    }

    // Member Operations
    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public void listMembers() {
        members.values().forEach(System.out::println);
    }

    // Borrow/Return
    public boolean borrowBook(String memberId, String bookId) {
        Member m = members.get(memberId);
        Book b = books.get(bookId);
        if (m != null && b != null && !b.isBorrowed()) {
            b.borrowBook();
            m.borrowBook(bookId);
            return true;
        }
        return false;
    }

    public boolean returnBook(String memberId, String bookId) {
        Member m = members.get(memberId);
        Book b = books.get(bookId);
        if (m != null && b != null && b.isBorrowed()) {
            b.returnBook();
            m.returnBook(bookId);
            return true;
        }
        return false;
    }

    public Map<String, Book> getBooks() { return books; }
    public Map<String, Member> getMembers() { return members; }
}
