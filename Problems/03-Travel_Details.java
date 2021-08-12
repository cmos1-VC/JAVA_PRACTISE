/*Create a class Person with the following private member variables

String name
char gender
int age
Include appropriate getters and setters method 

Create a class BusTicket with the following private member variables

int ticketNo
float ticketPrice
float totalAmount
Person person
Include appropriate getters and setters method 

Write the following method in the BusTicket class
void calculateTotal()—this method should calculate the total and set it based on the discount given below:

For Children whose age is less than 16, give 50% discount
For Senior citizen whose age is greater than or equal to 60 give 25% discount
For Ladies give 10% discount
No discount for remaining category. 
Based on above condition calculate total price. 
Create TestMain class which has main method and do the following input and output process .

To get the input write a method

public static BusTicket getTicketDetails() - Get the inputs relevant to BusTicket in this method and return the BusTicket object.  Call this method in the main method, using the returned object invoke the method calculateTotal and print the output accordingly 

Note: Do not create a static reference for the Scanner class, create a scanner object inside the method.

Sample input 1:

Enter the passenger name:
vivek
Enter the gender(M or F / m or f):
M
Enter the age:
16
Enter the ticket no:
123
Enter the ticket price:
100.0

Sample Output 1

Ticket no:123
Passenger Name:vivek
Price of a ticket : 100.0
Total Amount : 100.0



Sample input 2:
Enter the passenger name:
Priya
Enter the gender(M or F / m or f):
F
Enter the age:
61
Enter the ticket no:
140
Enter the ticket price:
500.0

Sample Output 1

Ticket no:140
Passenger Name:Priya
Price of a ticket : 500.0
Total Amount : 375.0

*/


//ANSWER//

package Problems;

import java.util.Scanner;

class Person
{
    private String name;
    private char gender;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
class BusTicket
{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;
    public int getTicketNo() {
        return ticketNo;
    }
    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }
    public float getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public float getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }
    public Person getPerson() {
        System.out.println("Passenger Name:" + person.getName());
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    
    void calculateTotal()

    {
        int age = person.getAge();
        float Amount = 0;
        char g=person.getGender();
        if (age<16)
        {
            Amount = (ticketPrice*50)/100;
            totalAmount = ticketPrice - Amount;
        }
        else if(age>=60)
        {
            Amount = (ticketPrice*25)/100;
            totalAmount = ticketPrice - Amount;
        }
        else if(age>=16 && age< 60)
        {
            if(g == 'f' || g == 'F')
            {
                Amount = (ticketPrice*10)/100;
                totalAmount = ticketPrice - Amount;
            }
            else{
                totalAmount = ticketPrice;
            }
        }
        else
        {
            totalAmount = ticketPrice;
        }
        setTotalAmount(totalAmount);
        
    }
        
}


public class Travel_Details {
   
    public static BusTicket getTicketDetails()
    {
        Scanner sc = new Scanner(System.in);
        BusTicket b1 = new BusTicket();
        System.out.println("Enter the passenger name:");
        String name = sc.nextLine();
        System.out.println("enter the gender:");
        char gender = sc.next().charAt(0);
        System.out.println("enter age:");
        int age = sc.nextInt();
        sc.nextLine();
        Person p = new Person();
        p.setName(name);
        p.setAge(age);
        p.setGender(gender);
        b1.setPerson(p);
        System.out.println("Enter ticket ticket no:");
        int ticketNo = sc.nextInt();
        b1.setTicketNo(ticketNo);
        sc.nextLine();
        System.out.println("enter the ticket price:");
        float ticketprice = sc.nextFloat();
        b1.setTicketPrice(ticketprice);
        return b1;
    }
   
    public static void main(String args[])
    {
        Travel_Details td = new Travel_Details();
        BusTicket bt_1 = new BusTicket();
        bt_1 = Travel_Details.getTicketDetails();
        bt_1.calculateTotal();



        System.out.print("ticket no:" + bt_1.getTicketNo());
        bt_1.getPerson();
        System.out.println("Price of the Ticket:" + bt_1.getTicketPrice());
        System.out.println("Total amount:" + bt_1.getTotalAmount());


    }
}
