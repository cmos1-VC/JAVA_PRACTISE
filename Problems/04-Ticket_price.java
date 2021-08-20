/*Create a class Ticket with the following private variables
int ticketid;
int price;
static int availableTickets;


Include getters and setters methods in the Ticket class.

AvailableTickets should hold only positive value. Zero and negative values are not allowed.(This logic should be checked inside the corresponding setter method)

Write the following method in the Ticket class:

public int calculateTicketCost(int nooftickets) —this method should check the ticket availability, If the tickets are available, reduce the nooftickets from availableTickets and calculate the total amount as nooftickets*price  and return the total amount.  If the tickets are not available, this method should return -1.

Write a main method in the Main class to test the application.

Note: Avoid using System.exit

Sample input and output

Enter no of bookings:
2
Enter the available tickets:
25
Enter the ticketid:
123
Enter the price:
100
Enter the no of tickets:
5
Available tickets: 25

Total amount:500

Available ticket after booking:20

Enter the ticketid:
124
Enter the price:
100
Enter the no of tickets:
2
Available tickets: 20

Total amount:200

Available ticket after booking:18

Sample input and output 2:

Enter no of bookings:
1
Enter the available tickets:
25
Enter the ticketid:
123
Enter the price:
100
Enter the no of tickets:
26
Tickets not sufficient / available
*/
package Problems;

import java.util.Scanner;

class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;

    public int getTicketid() {
        return ticketid;
    }
    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    public static void setAvailableTickets(int availableTickets) {
        if(availableTickets >=0)
        {
            Ticket.availableTickets = availableTickets;
        }
    }
    public static int getAvailableTickets() {
        return availableTickets;
    }
    public int calculateTicketCost(int nooftickets){
        if(availableTickets >= nooftickets){
            availableTickets-=nooftickets;
            return nooftickets*price; 
        }
        else{
            return -1;
        }
    }

}

public class ticket_Price {
    public static void main(String args[]){

        Ticket t1 = new Ticket();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int noofbookings = sc.nextInt();
        System.out.println("Enter the avilable tickets:");
        Ticket.setAvailableTickets(sc.nextInt());
        while(noofbookings > 0){
            System.out.println("Enter the ticketid:");
            t1.setTicketid(sc.nextInt());
            System.out.println("Enter the price:");
            t1.setPrice(sc.nextInt());
            System.out.println("Enter the no of tickets");
            int no_oftickets = sc.nextInt();
            if(t1.calculateTicketCost(no_oftickets) ==-1)
            {
                continue;
            }
            System.out.println("Available Tickets:" + Ticket.getAvailableTickets());
            System.out.println("Total Amount" + t1.calculateTicketCost(no_oftickets));
            System.out.println("Available Tickets after booking:" + Ticket.getAvailableTickets());
            noofbookings--;
        }
        

    }
}
