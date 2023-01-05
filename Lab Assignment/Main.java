import java.lang.*;

public class Main
{
	public static void main(String[] args) {

		TextBook tb1 = new TextBook("111", "Advanced Java", "Hasib", 330, 30, 37);
		// TextBook tb2 = new TextBook();
		// TextBook tb3 = new TextBook();
		// TextBook tb4 = new TextBook();
		// TextBook tb5 = new TextBook();

	    // tb5.setIsbn();
	    // tb5.setBookTitle();

	    StoryBook sb1 = new StoryBook("233", "Chaya", "Humayun", 250, 50, "Story");
		// StoryBook sb2 = new StoryBook();
		// StoryBook sb3 = new StoryBook();
		// StoryBook sb4 = new StoryBook();
		// StoryBook sb5 = new StoryBook();

	    // sb5.setIsbn();
	    // sb5.setBookTitle();
		

		


		BookShop bs1 = new BookShop("");
		bs1.insertTextBook(tb1);
		// bs1.insertTextBook(tb2);
		// bs1.insertTextBook(tb3);
		// bs1.insertTextBook(tb4);
		// bs1.insertTextBook(tb5);
		bs1.insertStoryBook(sb1);
		// bs1.insertStoryBook(sb2);
		// bs1.insertStoryBook(sb3);
		// bs1.insertStoryBook(sb4);
		// bs1.insertStoryBook(sb5);

		// bs1.removeTextBook(tb3);
		// bs1.removeStoryBook(sb3);

		
		bs1.showAllTextBooks();
		bs1.showAllStoryBooks();

		bs1.searchTextBook("111");
		
	}
}