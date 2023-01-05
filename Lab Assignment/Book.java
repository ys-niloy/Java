import java.lang.*;
import java.util.Scanner;

public class Book
{
		String isbn;
		String bookTitle;
		String authorName;
		double price;
		int availableQuantity;

		public Book()
		{
			System.out.println("Empty Constructor");
		}
		public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
		{
			System.out.println("\n________________________");
			
			System.out.println("\nBook Constructor  Called");

			this.isbn = isbn;
			this.bookTitle = bookTitle;
			this.authorName = authorName;
			this.price = price;
			this.availableQuantity = availableQuantity;

			System.out.println("\n________________________");

		/*	System.out.println("ISBN : "+isbn);
			System.out.println("Book Title: "+bookTitle);
			System.out.println("Author Name: "+authorName);
			System.out.println("Price of the book is : "+price);
			System.out.println("Available Quantity: "+availableQuantity);	*/
		}

		public void setIsbn(String isbn)
		{
			this.isbn = isbn;
		}
		public void setBookTitle(String bookTitle)
		{
			this.bookTitle = bookTitle;
		}
		public void setAuthorName(String authorName)
		{
			this.authorName = authorName;
		}
		public void setPrice(double price)
		{
			this.price = price;
		}
		public void setAvailableQuantity(int availableQuantity)
		{
			this.availableQuantity = availableQuantity;
		}

		public String getIsbn( )
		{
			return isbn;
		}
		public String getBookTitle( )
		{
			return bookTitle;
		}
		public String getAuthorName( )
		{
			return authorName;
		}
		public double getPrice( )
		{
			return price;
		}

		public int getAvailableQuantity( )
		{
			return availableQuantity;		
		}

		public void addQuantity(int amount)
		{
			availableQuantity = availableQuantity + amount;
		}
		public void sellQuantity(int amount)
		{
			availableQuantity = availableQuantity - amount;
		}

		public void showDetails()
		{
			System.out.println("\nISBN : "+isbn);
			System.out.println("\nBook Title: "+bookTitle);
			System.out.println("\nAuthor Name: "+authorName);
			System.out.println("\nPrice of the book is : "+price);
			System.out.println("\nAvailable Quantity: "+availableQuantity);
		}


}