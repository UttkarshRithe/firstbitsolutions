//3. Book Hierarchy
//
//Book
//
//title
//author
//price

class Book
{
	String title;
	String author;
	double price;
	
	Book()
	{
		this.title="not given";
		this.author="not given";
		this.price=0;
	}
	
	Book(String title,String author,double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	String getTitle() {
		return title;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	String getAuthor() {
		return author;
	}
	
	void setAuthor(String author) {
		this.author = author;
	}
	
	double getPrice() {
		return price;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Title:"+this.title);
		System.out.println("Author:"+this.author);
		System.out.println("Price:"+this.price);
	}
}


//TextBook is-a Book
//
//subject
//gradeLevel

class TextBook extends Book
{
	String subject;
	String gradeLevel;
	
	TextBook()
	{
		super();
		this.subject="not given";
		this.gradeLevel="not given";
	}
	
	TextBook(String title,String author,double price,
			 String subject,String gradeLevel)
	{
		super(title,author,price);
		this.subject=subject;
		this.gradeLevel=gradeLevel;
	}
	
	void display()
	{
		super.display();
		System.out.println("Subject:"+this.subject);
		System.out.println("Grade Level:"+this.gradeLevel);
	}
}


//Novel is-a Book
//
//genre
//language

class Novel extends Book
{
	String genre;
	String language;
	
	Novel()
	{
		super();
		this.genre="not given";
		this.language="not given";
	}
	
	Novel(String title,String author,double price,
		  String genre,String language)
	{
		super(title,author,price);
		this.genre=genre;
		this.language=language;
	}
	
	void display()
	{
		super.display();
		System.out.println("Genre:"+this.genre);
		System.out.println("Language:"+this.language);
	}
}

class TestBook
{
	public static void main(String args[])
	{
		Novel n1 = new Novel();
		n1.display();
	}
}