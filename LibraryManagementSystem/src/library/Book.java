package library;

public class Book {
	private String title;
	private String author;
	private int bookId;

	public Book(int bookId, String title, String author) {

		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getBookId() {
		return bookId;
	}

	@Override
	public String toString() {
		return "Book [author = " + author + ", bookId = " + bookId + ", title = " + title + "]";
	}

}
