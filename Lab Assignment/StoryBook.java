import java.lang.*;

public class StoryBook extends Book
{
		private String category;

		StoryBook()
		{
			System.out.println("Empty Story Book Constructor");
		}

		StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
		{

			super(isbn,bookTitle, authorName, price, availableQuantity);
			this.category = category;
			
		}

		public void setCategory(String category)
		{
			this.category = category;
		}

		public String getCategory()
		{
			return category;
		}
}