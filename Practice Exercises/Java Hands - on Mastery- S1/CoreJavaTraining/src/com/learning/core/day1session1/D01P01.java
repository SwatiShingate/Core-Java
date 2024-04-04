package com.learning.core.day1session1;
class Book
{
private String book_title;
private double book_price;

//getter method for book_title

public String get_book_title()
{
    return book_title;
}

//setter method for book_title

public void set_book_title(String title)
{
    this.book_title = title;
}

//getter method for book_price

public double get_book_price()
{
    return book_price;
}

//setter method for book_price

public void set_book_price(double price)
{
    this.book_price = price;
}

/*Book()
{
    
}*/

Book(String title, double price)
{
    this.book_title = title;
    this.book_price = price;
}

public void createBooks()
{
   System.out.println("Book Title :" +book_title+ "Java Programming");
}

public void showBooks()
{
   System.out.println("BOOK_TITLE :"+book_title);
    System.out.println("BOOK_PRICE :"+book_price);
}
}


public class D01P01 
	 {      
		    public static void main(String[] args)
		    {
		       Book b1 = new Book("Java Programming",350.0);
		       System.out.println("Book Title : " +b1.get_book_title() +" " + "and" + " "+ "Book Price :" +b1.get_book_price());
		       //System.out.println(b1.get_book_price());
		    }
		    }

	