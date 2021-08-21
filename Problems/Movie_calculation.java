/*Movie Ticket Calculation

Create a class Movie with the following private member variables.

String movieName
String movieCategory
int ticketCost
Include appropriate getters and setters method in Movie class.
Write the following method in the Movie class:
public int calculateTicketCost(String circle)--This method should take circle as argument. Return 0 when any one of the following condition met :

If circle is gold and movie category is 2D set ticket cost Rs.300
If circle is gold and movie category is 3D set ticket cost Rs.500
If circle is silver and movie category is 2D set ticket cost Rs.250
If circle is silver and movie category is 3D set ticket cost Rs.450
Return -1 if category is invalid.  Return -2 if circle is invalid and -3 if both are invalid.

Create a Main class to get the input and to display the output

Get the input for Movie using the method - public static Movie getMovieDetails(). Invoke this method from the main method and store the Movie object.

Get the input for circle using the method - public static String getCircle().  Invoke this method from the main method and store the circle value.

Next, invoke the calculateTicketCost method in Movie by passing this circle and calculate the ticket cost and set to the ticketCost attribute and print the output.

If the return from calculateTicketCost is zero, the output should be be  "The ticket cost is=<ticket cost>".

If it returns -1, the output should be "Sorry there is no <category> type of category in theater."

If the return is -2, the output should be "Sorry!!! Circle is Invalid."

If the return is -3, the output should be "Sorry!!! Both circle and category are Invalid."

Note: Do not create a static reference for the Scanner class, create a scanner object inside the method.

Sample Input 1:

Enter the movie name:
VIP
Enter the movie category:
2D
Enter the circle:
gold

Sample Output 1:

Movie name = VIP
Movie category = 2D
The ticket cost is = 300*/




package Problems;

import java.util.Scanner;

class Movie
{
    private String movieName;
    private String movieCategory;
    private int ticketCost;

    public void setmovieName(String movieName)
    {
        this.movieName = movieName;
    }
    public String getmovieName()
    {
        return this.movieName;
    }

    
    public void setmovieCategory(String movieCategory)
    {
        this.movieCategory = movieCategory;
    }
    public String getmovieCaterogy()
    {
        return this.movieCategory;
    }

    public void setticketCost(int ticketCost)
    {
        this.ticketCost = ticketCost;
    }
    public int getticketCost()
    {
        return this.ticketCost;
    }
    public int calculateTicketCost(String circle)
    {
        if(!circle.equalsIgnoreCase("GOLD") && !circle.equalsIgnoreCase("SILVER") && movieCategory.equalsIgnoreCase("2D") || movieCategory.equalsIgnoreCase("3D"))
        {
            return -2;
        }
        else if((circle.equalsIgnoreCase("GOLD") || circle.equalsIgnoreCase("SILVER")) && !movieCategory.equalsIgnoreCase("2D") || !movieCategory.equalsIgnoreCase("3D"))
        {
            return -1;
        }
        else if((!circle.equalsIgnoreCase("GOLD") && !circle.equalsIgnoreCase("SILVER")) && (movieCategory.equalsIgnoreCase("2D") && movieCategory.equalsIgnoreCase("3D")))
        {
            return -3;
        }
        else{
            if(circle.equalsIgnoreCase("GOLD") && movieCategory.equalsIgnoreCase("2D"))
            
                ticketCost = 300;
            
            else if(circle.equalsIgnoreCase("GOLD") && movieCategory.equalsIgnoreCase("3D"))
            
                ticketCost = 500;
            
            else if(circle.equalsIgnoreCase("SILVER") && movieCategory.equalsIgnoreCase("2D"))
            
                ticketCost = 250;
            
            else if(circle.equalsIgnoreCase("SILVER") && movieCategory.equalsIgnoreCase("3D"))
            
                ticketCost = 450;
                return 0;
            
        }


    }

}
public class Bank_account
{
    public static Movie getMovieDetails()
    {
        Movie m = new Movie();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name: ");
        m.setmovieName(sc.nextLine());
        System.out.println("Enter the movie category:");
        m.setmovieCategory(sc.nextLine());
        return m;
        
    }
    public static String getCircle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the circle:");
        String name = sc.nextLine();
        return name;
    }
    public static void main(String args[])
    {
        Movie m1 = getMovieDetails();
        int a = m1.calculateTicketCost(getCircle());
        System.out.println("Movie name:" + m1.getmovieName());
        System.out.println("Movie Category :" + m1.getmovieCaterogy());
        if(a==-1)
        {
            System.out.println("Sorry there is no " + m1.getmovieCaterogy() + " type of category in theater");
        }
        else if(a==-2)
        {
            System.out.println("Sorry!!!Circle is Invalid.");
        }
        else if(a==-3)
        {
            System.out.println("Sorry!!!BNoth Circle and Category are invalid");
        }
        else if(a==0)
        {
            System.out.println("the ticket cost is " + m1.getticketCost());
        }
        
    }
}
