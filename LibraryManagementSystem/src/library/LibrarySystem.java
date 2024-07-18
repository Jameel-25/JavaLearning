package library;

public class LibrarySystem {
	public static void main(String[] args) {
		Library library = new Library();

		// Adding some books
		library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
		library.addBook(new Book(2, "1984", "George Orwell"));
		library.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));

		// Register some users
		library.registerUser(new User(1, "Alice"));
		library.registerUser(new User(2, "Bob"));

		// Creating threads for borrowing and returning books
		Thread borrowThread1 = new Thread(new BorrowTask(library, 1, 1));
		Thread borrowThread2 = new Thread(new BorrowTask(library, 2, 2));
		Thread returnThread1 = new Thread(new ReturnTask(library, 1));

		borrowThread1.start();
		borrowThread2.start();

		try {
			borrowThread1.join();
			borrowThread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		returnThread1.start();
		try {
			returnThread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Viewing all books and users
		library.viewBooks();
		library.viewUsers();
	}
}

class BorrowTask implements Runnable {
	private Library library;
	private int userId;
	private int bookId;

	public BorrowTask(Library library, int userId, int bookId) {
		this.library = library;
		this.userId = userId;
		this.bookId = bookId;
	}

	@Override
	public void run() {
		try {
			library.borrowBook(userId, bookId);
			Thread.sleep(1000);// Simulate time taken to borrow a book
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class ReturnTask implements Runnable {
	private Library library;
	private int userId;

	public ReturnTask(Library library, int userId) {
		this.library = library;
		this.userId = userId;
	}

	@Override
	public void run() {
		try {
			library.returnBook(userId);
			Thread.sleep(1000); // Simulate time taken to return a book
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
