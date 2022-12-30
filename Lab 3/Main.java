import java.lang.*;

public class Main{
    public static void main(String[] args) {

       

        // StoryBook
        StoryBook s1 = new StoryBook();
        StoryBook s2 = new StoryBook("1001",
                                    "Java Basics",
                                    "Steve",
                                    700.00,
                                    30,
                                    "Programming");
        
        
        s2.showDetails();

        

        //Text Book
        TextBook t1 = new TextBook();
        TextBook t2 = new TextBook("3001",
                                    "Advanced Python With Harry",
                                    "Harry",
                                    700.00,
                                    80,
                                    37);
                                    
       
        t2.showDetails();


    }
}
