import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        Book b1 = new Book("17565376",
                            "Advanced Java",
                            "Blake",
                            600.00,
                            10);

        
        

        b1.addQuantity(50);
        b1.sellQuantity(20);


        Book b2 = new Book();
        Book b3 = new Book();

        //For b2
        b2.setIsbn("87762387");
        b2.setBookTitle("C++ With Steve");
        b2.setAuthorName("Steve");
        b2.setPrice(750.00);
        b2.setAvailableQuantity(30);

        b2.addQuantity(40);
        b2.sellQuantity(10);

        //For b3
        b3.setIsbn("1232767");
        b3.setBookTitle("English For Tomorrow");
        b3.setAuthorName("Anderson");
        b3.setPrice(450.00);
        b3.setAvailableQuantity(27);

        b3.addQuantity(20);
        b3.sellQuantity(15);

        
        Book arr[] = new Book[]{b1, b2, b3};

        System.out.println("_________________________________________________________________________");

        for(int i=0; i<arr.length; i++){

            System.out.println("______________________Details of " + (i+1) +" book___________________\n");

            System.out.println("Book "+(i+1)+" ISBN                : "+arr[i].getIsbn());
            System.out.println("Book "+(i+1)+" BOOKTITLE           : "+arr[i].getBookTitle());
            System.out.println("Book "+(i+1)+" AUTHOR NAME         : "+arr[i].getAuthorName());
            System.out.println("Book "+(i+1)+" PRICE               : "+arr[i].getPrice());
            System.out.println("Book "+(i+1)+" AVAILABLE QUANTITY  : "+arr[i].getAvailableQuantity());

            System.out.println("______________________________________________________________________");
        }
    }
}