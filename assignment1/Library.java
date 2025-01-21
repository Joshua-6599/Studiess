package assignment1;

public class Library {
	
	public String addBook(String  bookTitle) {
		System.out.println("Book added successfully");
		return(bookTitle);
	}
public void issuebook() {
	System.out.println("Book issued successfully");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library l = new Library();
		l.addBook("addBook");
		l.issuebook();
	}

}
