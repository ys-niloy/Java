import java.lang.*;

public class Start
{
	public static void main(String[] args) {
		
		StoryBook sb1 = new StoryBook("112773","Chuti","Humayun", 700, 30, "Storybook");

		sb1.showDetails();
		// sb1.setCategory("");
		// System.out.println("Category: "+sb1.getCategory()); 

		StoryBook sb2 = new StoryBook();

		sb2.setIsbn("845789");
		sb2.setBookTitle("The Silent Patient");
		sb2.setAuthorName("Steve");
		sb2.setPrice(1500);
		sb2.setAvailableQuantity(30);

		System.out.println("ISBN: "+sb2.getIsbn());
		System.out.println("Book Title: "+sb2.getBookTitle());
		System.out.println("Author Name: "+sb2.getAuthorName());
		System.out.println("Price: "+sb2.getAvailableQuantity());


		TextBook tb1 = new TextBook("1545234","English For Tomorrow","Masud", 330, 27, 37);

		tb1.showDetails();
		// tb1.setStandard();
		// System.out.println("Standard: "+tb1.getStandard());

		TextBook tb2 = new TextBook();

		tb2.setIsbn("153879283");
		tb2.setBookTitle("Chemistry");
		tb2.setAuthorName("Gupta");
		tb2.setPrice(450);
		tb2.setAvailableQuantity(40);

		System.out.println("ISBN: "+tb2.getIsbn());
		System.out.println("Book Title: "+tb2.getBookTitle());
		System.out.println("Author Name: "+tb2.getAuthorName());
		System.out.println("Price: "+tb2.getAvailableQuantity());


	}
}