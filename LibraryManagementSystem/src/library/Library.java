package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
	private List<Book> books = new ArrayList<Book>();
	private List<User> users = new ArrayList<User>();
	private Map<Integer, Integer> borrowedBooks = new HashMap<Integer, Integer>(); // <UserID, BookId>

	public synchronized void addBook(Book book) {
		books.add(book);
		System.out.println("Added: " + book);
	}

	public synchronized void removeBook(int bookId) throws Exception {
		Book book = findBook(bookId);
		if (book != null) {
			books.remove(book);
			System.out.println("Removed: " + book);
		} else {
			throw new Exception("Book not found!");
		}
	}

	public synchronized void registerUser(User user) {
		users.add(user);
		System.out.println("Registered: " + user);
	}

	public synchronized void borrowBook(int userId, int bookId) throws Exception {
		Book book = findBook(bookId);
		User user = findUser(userId);
		if (book != null && user != null) {
			if (borrowedBooks.containsKey(bookId)) {
				throw new Exception("Book is already borrowed!");

			}
			borrowedBooks.put(userId, bookId);
			System.out.println(user.getName() + " borrowed " + book.getTitle());
		} else {
			throw new Exception("Book or user not found!");
		}
	}

	public synchronized void returnBook(int userId) throws Exception {
		if (borrowedBooks.containsKey(userId)) {
			int bookId = borrowedBooks.remove(userId);
			Book book = findBook(bookId);
			System.out.println("Returned: " + book.getTitle());
		} else {
			throw new Exception("No book to return for this user!");
		}
	}

	public synchronized void viewBooks() {
		System.out.println("Books in Library:");
		for (Book book : books) {
			System.out.println(book);
		}
	}

	public synchronized void viewUsers() {
		System.out.println("Registered Users");
		{
			for (User user : users) {
				System.out.println(user);
			}
		}
	}

	private Book findBook(int bookId) {
		for (Book book : books) {
			if (book.getBookId() == bookId) {
				return book;
			}
		}
		return null;
	}

	private User findUser(int userId) {
		for (User user : users) {
			if (user.getUserId() == userId) {
				return user;
			}
		}
		return null;
	}
}
