import java.lang.*;

public class BookShop
{
	private String name;
	private TextBook textbooks[] = new TextBook[100];
	private StoryBook storybooks[] = new StoryBook[100];

	public BookShop()
	{
		System.out.println("Empty BookShop Constructor");
	}
	public BookShop(String name)
	{
		this.name = name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public boolean insertTextBook(TextBook tb)
	{
		boolean flag = false;
		for(int i = 0; i<textbooks.length; i++)
		{
			if(textbooks[i] == null)
			{
				textbooks[i] = tb;
				flag = true;
				break;
			}
		}
		if(flag==true)
			{
				System.out.println("Insertion successful");
				return flag;
				
			}
			else
			{
				System.out.println("Insertion failed");
				return flag;
				
			}
	}

	public boolean removeTextBook(TextBook tb)
	{
		boolean flag = false;
		int ctr = 0;
		for(int i = 0; i<textbooks.length; i++)
		{
			if(textbooks[i] == tb)
			{
				textbooks[i] = null;
				ctr = 1;
				flag = true;
				break;
			}
		}
		if(ctr == 1){
			System.out.println("Removed!");
			return flag;
		}

		else{
			System.out.println("Removal Failed!");
			return flag;
		}
	}	

	public TextBook searchTextBook(String isbn)
	{
		int flag = 0;
		int k = 0;

		for(int i = 0; i<textbooks.length; i++)
		{
			if(textbooks[i].getIsbn() == isbn || textbooks[i].isbn == isbn)
			{
				
				//System.out.println("Found");
				flag = 1;
				k = i;
				break;

			}

		}

		if(flag == 1)
		{
			System.out.println("Found");
			return textbooks[k];
		}
		else
		{
			System.out.println("Not found");
			// return ;
		}
		return textbooks[k];
	}


	public void showAllTextBooks()
	{
		for(int i = 0; i<textbooks.length; i++)
		{
			if(textbooks[i] != null)
			{
				System.out.println("BookShop Name: "+name);
				System.out.println("Book Number: "+ i+1);
				textbooks[i].showDetails();
				System.out.println("___________________");
			}
			else{System.out.println("Object not available!");}
		}

		 
	}


	// Story Book Part ;

	public boolean insertStoryBook(StoryBook sb)
	{
		boolean flag = false;
		for(int i = 0; i<storybooks.length; i++)
		{
			if(storybooks[i] == null)
			{
				storybooks[i] = sb;
				flag = true;
				break;
			}
		}
		if(flag==true)
			{
				System.out.println("Insertion successful");
				return flag;
				
			}
			else
			{
				System.out.println("Insertion failed");
				return flag;
				
			}
	}

	public boolean removeStoryBook(StoryBook sb)
	{
		boolean flag = false;
		for(int i = 0; i<storybooks.length; i++)
		{
			if(storybooks[i] == sb)
			{
				storybooks[i] = null;
				flag = true;
				break;
			}
		}
		if(flag == true){
			System.out.println("Removed!");
			return flag;
		}

		else{
			System.out.println("Removal Failed!");
			return flag;
		}
	}	

	public StoryBook searchStoryBook(String isbn)
	{
		int flag = 0;
		int store = 0;
		for(int i = 0; i<storybooks.length; i++)
		{
			if(storybooks[i].getIsbn() == isbn)
			{
				
				// System.out.println("Found");
				flag = 1;
				store = i;
				break;

			}

		}
		if(flag == 1){
		System.out.println("Found");
	}
	return storybooks[store];
}


	public void showAllStoryBooks()
	{
		for(int i = 0; i<storybooks.length; i++)
		{
			if(storybooks[i] != null)
			{
				System.out.println("BookShop Name: "+name);
				System.out.println("Book Number: "+ i+1);
				storybooks[i].showDetails();
				System.out.println("________________________");
			}
			else{System.out.println("Object not available!");}
		}
	}


}