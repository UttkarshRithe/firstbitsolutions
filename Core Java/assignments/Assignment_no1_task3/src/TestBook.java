class Book
{
	int ISBN;
	String Title;
	String Author;
	double price;
	int getISBN() {
		return ISBN;
	}
	void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	String getTitle() {
		return Title;
	}
	void setTitle(String title) {
		Title = title;
	}
	String getAuthor() {
		return Author;
	}
	void setAuthor(String author) {
		Author = author;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void display()
	{
		System.out.println("ISBN:"+this.ISBN);
		System.out.println("Title:"+this.Title);
		System.out.println("Author:"+this.Author);
		System.out.println("Price:"+this.price);
	}
}
public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println(b1);
		b1.setISBN(4512);
		b1.setTitle("Java");
		b1.setAuthor("Dont Know");
		b1.setPrice(453.23);
		System.out.println("Using getter");
		System.out.println("ISBN:"+b1.getISBN());
		System.out.println("Title:"+b1.getTitle());
		System.out.println("Author:"+b1.getAuthor());
		System.out.println("Price:"+b1.price);
		
		System.out.println("Using display");
		b1.display();
	}
}
