import java.lang.*;

public class TextBook extends Book
{
		private int standard;

		TextBook( )
		{
			System.out.println("Empty Text Book Constructor");
		}

		TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)
		{

			super(isbn,bookTitle, authorName, price, availableQuantity);
			this.standard = standard;

		}

		public void setStandard(int standard)
		{
			this.standard = standard;
		}

		public int getStandard()
		{
			return standard;
		}



}