/*Create a class Book with the following private member variables

  > String bookName
  > int bookPrice 
  > String authorName
Include appropriate getters and setters method.
Create a class TestBook which has the main method.  Get the details as shown in the sample input. Create an object for book class and assign the value for its attrbutes using the setters.  Print the output as shown in the sample output using the getters method. 

Note: Use the same attribute names as given in the question and camel case notation for methods.  Name of book and author can have space in between.
Sample Input 1:

Enter the Book name:
Java
Enter the price:
500
Enter the Author name:
Einstein

Sample Output 1:

Book Details
Book Name :Java
Book Price :500
Author Name :Einstein
*/


import java.util.Scanner;

class Book
{
    private String bookName;
    private int bookPrice;
    private String authorName;

    public String Getbookname()
    {
        return bookName;
    }
    public String GetauthorName()
    {
        return authorName;
    }
    public int Getbookprice()
    {
        return bookPrice;
    }
    public void SetBookname(String bookName)
    {
        this.bookName = bookName;
    } 
    public void Setauthorname(String authorName)
    {
        this.authorName = authorName;
    }
    public void Setbookprice(int bookPrice)
    {
        this.bookPrice = bookPrice;
    }
};




public class TestBook
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name: "  );
        String bookname = sc.nextLine();
        System.out.println("Enter the price: "  );
        int bookprice = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Author Name: "  );
        String authorname = sc.next();
        Book obj = new Book();
        obj.SetBookname(bookname);
        obj.Setbookprice(bookprice);
        obj.Setauthorname(authorname);
        System.out.println("Book Details");
        System.out.println("Book Name: " + obj.Getbookname());
        System.out.println("Book Price :" + obj.Getbookprice());
        System.out.println("Author Name :" + obj.GetauthorName());
    }
}

        
